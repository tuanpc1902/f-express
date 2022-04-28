import React from 'react'
import './skin/index.scss'
import logo from '../../assets/images/header/logo-index-1.png'
import 'font-awesome/css/font-awesome.min.css';
const index = () => {

    return(
        <div className="header">
            <div className="header-top">
                <div className="header-top-line">
                    <div className="header-top-left">
                        <div className="header-top-left-phone">
                            1900 636677
                        </div>
                        <div className="header-top-left-post-offices">
                            Post Offices
                        </div>
                    </div>
                    <div className="header-top-right">
                        <div className="header-top-right-about">
                            About FExpess
                        </div>
                        <div className="header-top-right-jobs">
                            Recruit
                        </div>
                        <div className="header-top-right-language">
                            <select className='form-select'>
                                <option>English</option>
                                <option>Tiếng Việt</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <div className="header-body">
                <div className="header-logo">
                    <a href="/" className="header-logo-link">
                        <img src={logo} alt="" className="header-logo-img" />
                    </a>
                </div>
                <div className="header-nav">
                    <div className="header-nav-item">
                        <a href="/" className="header-nav-link">HOME</a>
                    </div>
                    <div className="header-nav-item">
                    <a href="/" className="header-nav-link">SERVICES</a>
                    </div>
                    <div className="header-nav-item">
                    <a href="/" className="header-nav-link">NEWS</a>
                    </div>
                    <div className="header-nav-item">
                        <a href="/" className="header-nav-link">
                        MORE INFORMATION
                        </a>
                    </div>
                </div>
                <div className="header-body-box-right">
                    <div className="header-signIn-signUp">
                        <button className="btn btn-submit">Sign in/  Sign up</button>
                    </div>
                    <div className="header-search">
                        <input type="text" className="form-control" placeholder='Enter code order' />
                    </div>
                </div>
            </div>
        </div>
    )
}

export default index;