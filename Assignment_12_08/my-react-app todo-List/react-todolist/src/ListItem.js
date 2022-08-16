

const ListItem = ({ onDone, onEdit, title, index, onDelete }) => {
    return(
        <li style={{ marginTop: 5 }}>
            <span> {title} </span>
            <span><input type="checkbox" style={{ width: 50 }} onClick={() => onDone(index)} /></span>
            <button style={{ backgroundColor: 'red' }} onClick={() => onDelete(index)}>Delete</button>
        </li>
    );
}

export default ListItem;