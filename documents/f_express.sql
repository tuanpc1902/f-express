create DATABASE f_express;
use f_express;
create table role(
	roleId int AUTO_INCREMENT PRIMARY KEY,
    roleName VARCHAR(20) not null
);

create table user(
	userId int AUTO_INCREMENT PRIMARY KEY,
	username		varchar(50)		not null unique,
	firstName		nvarchar(25)	null,
    lastName		nvarchar(25) 	null,
	password		varchar(255)	not null,
    uplineId		INT				not null,
	email			varchar(100)	not null unique,
	gender			int				null,
	first_address	nvarchar(50)	null,
    province		NVARCHAR(50)    null,
    district		NVARCHAR(50)	null,
	phone			varchar(20)		null,
	photo			varchar(225)	null,
	id_card			varchar(50)		null unique,
    lastLogin		nvarchar(100)	not null,
    createdBy		int				not null,
    createdDate		datetime		not null,
    updatedBy		INT				not null,
    updatedDate		DATETIME		not null,
    loginFail		int				not null DEFAULT 0,
	roleId			int				not null,
	verification_code varchar(64)   null,
	status			int				not null,
	provider		varchar(15),
	password_changed_time datetime,
    FOREIGN KEY (roleId) REFERENCES role(roleId)
);