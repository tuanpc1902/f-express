import React from 'react'
import { Form } from 'react-bootstrap'
import './skin/Login.scss'
import logo from '../../../assets/images/login/logo.png'
const Login = () => {
    document.title = 'Login - Flash Express'
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
                    <div className="login__username">
                        <div className="mb-3">
                            <label className='label'>Username</label>
                            <input type="text"  className="form-control" placeholder='Enter your username' />
                        </div>
                    </div>
                    <div className="login__password">
                    <div className="mb-3">
                            <label className='label'>Password</label>
                            <input type="password"  className="form-control" placeholder='Enter your password' />
                        </div>
                    </div>
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