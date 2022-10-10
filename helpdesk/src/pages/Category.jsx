import React, { Component } from 'react'
import { TreeItem, TreeView } from '@mui/lab';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import ChevronRightIcon from '@mui/icons-material/ChevronRight';
import { Box, Button, Modal, TextField, Typography } from '@mui/material';
import { getAllCategory, createCategory } from '../util/HttpService'

const style = {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: 400,
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 24,
    p: 4,
};

class Category extends Component {
    state = {
        categoryList: [],
        openAddModal: false,
        categoryName: '',
        subCategoryName: '',
        subCategoryList: []
    }

    componentDidMount() {
        this.fetchCategories()
    }

    fetchCategories = () => {
        getAllCategory().then((response) => {
            this.setState({ categoryList: response.data })
        })
    }

    onAddSubCategory = () => {
        let subCategoryList = this.state.subCategoryList
        subCategoryList.push({
            categoryName: this.state.subCategoryName
        })
        this.setState({ subCategoryList, subCategoryName: '' })
    }

    handleCreateCategory = () => {
        createCategory({
            categoryName: this.state.categoryName,
            subCategoryDTOS: this.state.subCategoryList
        }).then((response)=>{
            this.fetchCategories()
            this.setState({ subCategoryList: [], openAddModal: false })
        })
    }

    validateTicketCreate = () => {
        return this.state.categoryName.trim() == '' || this.state.subCategoryList.find(s=>s.categoryName.trim() == '') || this.state.subCategoryList.length == 0
    }

    validateAddSubCategory = () => {
        return this.state.subCategoryName.trim() == ''
    }


    render() {
        return (
            <div >
                <header className="header-fixed">
                    <div className="header-limiter">

                        <h1><a href="#">HelpDesk<span>Admin</span></a></h1>

                        <nav>
                        <a href="/employee-view-ticket" >Home</a> 
                            {/* <a href="#" class="selected">Create user</a> */}
                            {/* <a href="/register">User</a>
                            <a href="/category">Category</a>
                            <a href="/employee-view-ticket">Ticket</a> */}
                            <a href="/">Logout</a>
                        </nav>

                    </div>

                </header>
                <main>
                    <Button variant="contained" onClick={() => this.setState({ openAddModal: true })} sx={{mt:8, marginLeft:80,mb:2 }}>Add Category</Button>
                    {/* <TextField id="outlined-basic" /> */}
                    <TreeView
                        aria-label="file system navigator"
                        defaultCollapseIcon={<ExpandMoreIcon />}
                        defaultExpandIcon={<ChevronRightIcon />}
                        sx={{marginLeft:80, height: 700, flexGrow: 1, maxWidth: 500, overflowY: 'auto' }}
                    >

                        {
                            this.state.categoryList.map(category => (
                                <TreeItem key={category.id} nodeId={"" + category.id} label={category.categoryName}>
                                    {
                                        category.subCategoryDTOS.map(subCategory => (
                                            <TreeItem key={subCategory.id} nodeId={category.id + "" + subCategory.id} label={subCategory.categoryName}>
                                            </TreeItem>
                                        ))
                                    }
                                </TreeItem>
                            ))
                        }
                    </TreeView>

                    <Modal
                        open={this.state.openAddModal}
                        onClose={() => this.setState({ openAddModal: false })}
                        aria-labelledby="modal-modal-title"
                        aria-describedby="modal-modal-description"
                        status={this.state.status}
                        priority={this.state.priority}
                    >
                        <Box sx={style}>
                            <Typography id="modal-modal-description" sx={{ mt: 2,mb:2  }}>
                                Add Category
                            </Typography>
                            <div></div>

                            <Typography id="modal-modal-description" sx={{ mt: 2,mb:2  }}>
                                Category Name
                                <TextField id="outlined-basic" 
                                onChange={(e) => this.setState({ categoryName: e.target.value })}
                                />
                            </Typography>

                            <Typography id="modal-modal-description" sx={{ mt: 2,mb:2  }}>
                                Add Sub Category
                                <TextField id="outlined-basic" value={this.state.subCategoryName} variant="outlined" onChange={(e) => {
                                    this.setState({ subCategoryName: e.target.value })
                                    console.log(e.target.value);
                                }} />
                                <Button variant="contained" onClick={this.onAddSubCategory} disabled={this.validateAddSubCategory()}>Add Sub Category</Button>
                            </Typography>

                            <Typography id="modal-modal-description" sx={{ mt: 2,mb:2  }}>
                                {
                                    this.state.subCategoryList.map(sc=>(
                                        <div>{sc.categoryName}</div>
                                    ))
                                }
                            </Typography>

                            <Typography id="modal-modal-description" sx={{ mt: 2,mb:2 }}>
                                <Button disabled={this.validateTicketCreate()} variant="contained" onClick={this.handleCreateCategory}>Create</Button>
                            </Typography>
                        </Box>
                    </Modal>

                </main>
            </div>
        );
    }
}

export default Category;