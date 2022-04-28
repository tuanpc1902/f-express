import React, {useState} from 'react'
import { Form } from 'react-bootstrap'
import './skin/Login.scss'
import logo from '../../../assets/images/login/logo.png'
import userService from "../../../services/user/UserService";
const Login = () => {
    document.title = 'Login - Flash Express'

    const userInfo = {
        username: '',
        password: '',
        isLoginIn: false,
        isError: false
    }

    const [state, setState] = useState(userInfo);

    // const handleSubmit = (e) => {
    //     e.preventDefault()
    //
    //     const { username, password } = state
    //
    //
    //     userService.login()
    //         .then((response: { data: { username: any; }; }) => {
    //             const user = response.data.username
    //
    //         })
    //         .catch((error: any) => {
    //             console.log(error)
    //         })
    // }

    // @ts-ignore
    // @ts-ignore
    return (
        <div className='login__page'>
            <div className="login">
                <div className="login__header">
                    <span>Login</span>
                </div>
                <div className="login__body">
                    <div className="login__logo">
                        <a href='/' className='login__img-link'>
                        <img src={logo} alt="" className="login__img" />
                        </a>
                    </div>
                    <div className="login__language">
                        <div className="mb-3">
                            <label className='label'>Languages</label>
                            <select className='form-select'>
                                <option>English</option>
                                <option>Tiếng Việt</option>
                            </select>
                        </div>
                    </div>
                    <form>
                        <div className="login__username">
                            <div className="mb-3">
                                <label className='label'>Username</label>
                                <input type="text" name="username" className="form-control" placeholder='Enter your username' />
                            </div>
                        </div>
                        <div className="login__password">
                            <div className="mb-3">
                                <label className='label'>Password</label>
                                <input type="password" name="password" className="form-control" placeholder='Enter your password' />
                            </div>
                        </div>
                    </form>
                    <div className="login_captcha">

                    </div>
                </div>
                <div className="login__footer">
                    <button className="btn btn-success">
                        Submit
                    </button>
                </div>
            </div>
        </div>
    )
}

export default Login