import React from 'react'
import './skin/Register.scss'
import logo from '../../../assets/images/login/logo.png'
const Register = () => {
    document.title = 'Register - Flash Express';
    return(
        <div className='register__page'>
            <div className="register">
                <div className="register__header">
                    <div className="title">
                        <span>Register</span>
                    </div>
                </div>
                <div className="register__body">
                    <div className="register__logo">
                        <a href='/' className='register__img-link'>
                            <img src={logo} alt="" className="login__img" />
                        </a>
                    </div>
                    <div className="register__group">
                        <div className="commom-input register__username">
                            <div className="mb-3">
                                <label className='label'>Username</label>
                                <input type="text"  className="form-control" placeholder='Enter your username' />
                            </div>
                        </div>
                        <div className="commom-input register__password">
                        <div className="mb-3">
                                <label className='label'>Password</label>
                                <input type="password"  className="form-control" placeholder='Enter your password' />
                            </div>
                        </div>
                    </div>
                    <div className="register__group">
                        <div className="commom-input register__firstName">
                            <div className="mb-3">
                                <label className='label'>First name</label>
                                <input type="text"  className="form-control" placeholder='Enter your first name' />
                            </div>
                        </div>
                        <div className="commom-input register__lastName">
                            <div className="mb-3">
                                <label className='label'>Last name</label>
                                <input type="text"  className="form-control" placeholder='Enter your last name' />
                            </div>
                        </div>
                    </div>
                    <div className="register__group">
                        <div className="commom-input register__province">
                            <div className="mb-3">
                                <label className='label'>Province</label>
                                <select className='form-select'>
                                    <option>Province</option>
                                    <option>Ho Chi Minh</option>
                                    <option>Tay Ninh</option>
                                    <option>Lam Dong</option>
                                </select>
                            </div>
                        </div>
                        <div className="commom-input register__lastName">
                        <div className="mb-3">
                                <label className='label'>District</label>
                                <select className='form-select'>
                                    <option>District</option>
                                    <option>Binh Thanh</option>
                                    <option>District 1</option>
                                    <option>Thu Duc</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div className="register__group">
                        <div className="commom-input register__firstAddress">
                            <div className="mb-3">
                                <label className='label'>First Address</label>
                                <input type="text"  className="form-control" placeholder='Enter first address' />
                            </div>
                        </div>
                    </div>
                    <div className="register__login">
                        <a href='/login'>Go to login page !</a>
                    </div>
                </div>
                <div className="register__footer">
                    <button className="btn btn-success">
                        Submit
                    </button>
                </div>
            </div>

            {/* languages */}
            <div className="register__language">
                    {/* <label className='label'>Languages</label> */}
                    <select className='form-select'>
                        <option>English</option>
                        <option>Tiếng Việt</option>
                    </select>
            </div>
        </div>
    )
}

export default Register;