import axios from "axios";
export default axios.create({
    baseURL: "http://localhost:8080/api/f-express",
    headers: {
        "Content-type": "application/json"
    }
});