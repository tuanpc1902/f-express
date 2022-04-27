import http from "../axios";
class UserService {

    getAll() {
        return http.get("/user/all-user");
    }
    get(id) {
        return http.get(`/id/${id}`);
    }
    create(data) {
        return http.post("/tutorials", data);
    }
    update(id, data) {
        return http.put(`/tutorials/${id}`, data);
    }
    delete(id) {
        return http.delete(`/tutorials/${id}`);
    }
    deleteAll() {
        return http.delete(`/tutorials`);
    }
    findByTitle(title) {
        return http.get(`/tutorials?title=${title}`);
    }
}
export default new UserService();