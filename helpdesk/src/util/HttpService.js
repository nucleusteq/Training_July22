const axios = require('axios')

const getAllTicket = (param) => {
    return axios.get('http://localhost:8080/ticket/getall' + param)
}

const getAllUsers = () => {
    return axios.get('http://localhost:8080/user/get-all-users')
}

const updateTicket = (body) => {
    return axios.put('http://localhost:8080/ticket/update', body)
}

const getAllAdmin = () => {
    return axios.get('http://localhost:8080/user/getalladmin')
}

const getAllCategory = () => {
    return axios.get('http://localhost:8080/category/get-all')
}

const raiseTicket = (body) => {
    return axios.post('http://localhost:8080/ticket/raise-ticket', body)
}

const reopenTicket = (ticketId) => {
    return axios.get('http://localhost:8080/ticket/reopen/' + ticketId)
}

const createCategory = (body) => {
    return axios.post('http://localhost:8080/category/create', body)
}

export { getAllTicket, getAllUsers, updateTicket, getAllAdmin, getAllCategory, raiseTicket, reopenTicket, createCategory }