import axios from 'axios'
import { BASE_URL } from './constants';

export const fetchTables = () => {
    return axios.get(BASE_URL + 'tables').then(res => res.data)
}

export const fetchTable = (id) => {
    return axios.get(BASE_URL + 'tables/' + id).then(res => res.data)
}

export const createTable = (body) => {
    return axios.post(BASE_URL + 'tables', body).then(res => res.data)
}