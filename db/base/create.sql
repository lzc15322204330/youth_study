create table admin
(
    aid         bigint      not null auto_increment,
    create_time datetime,
    modify_time datetime,
    password    varchar(50) not null,
    username    varchar(50) not null,
    primary key (aid)
) engine = InnoDB
create table college_data
(
    id           bigint not null auto_increment,
    accept_rate  nvarchar,
    create_time  datetime,
    date_time    datetime,
    modify_time  datetime,
    success_rate nvarchar,
    primary key (id)
) engine = InnoDB
create table college_list
(
    id              bigint not null auto_increment,
    college_name    nvarchar,
    create_time     datetime,
    describe_text   nvarchar,
    modify_time     datetime,
    school_badge    nvarchar,
    college_data_id bigint,
    primary key (id)
) engine = InnoDB
create table lesson
(
    id          bigint not null auto_increment,
    bill        decimal(18, 2),
    create_time datetime,
    lesson_des NTEXT,
    lesson_id   nvarchar(50),
    lesson_name nvarchar(255),
    modify_time datetime,
    photo NTEXT,
    read_count  int,
    type        varchar(50),
    primary key (id)
) engine = InnoDB
create table order_list
(
    id           bigint not null auto_increment,
    car_id       nvarchar,
    coupon_id    int(11),
    coupon_price decimal(8, 2) unsigned,
    create_time  datetime,
    modify_time  datetime,
    order_id     nvarchar(32),
    order_status tinyint(1),
    pa_id        tinyint(1),
    pay_type     tinyint(1),
    total_num    int(11),
    total_price  decimal(8, 2) unsigned,
    user_name    nvarchar(32),
    user_phone   nvarchar(18),
    primary key (id)
) engine = InnoDB
create table shopping_car
(
    sid         int not null auto_increment,
    count       int,
    create_time datetime,
    is_del      int,
    is_pay      int,
    modify_time datetime,
    prodect_id  int,
    primary key (sid)
) engine = InnoDB
create table todo_list
(
    tid          int not null auto_increment,
    check_list   tinyint(1),
    create_time  datetime,
    mission      varchar(255),
    mission_time varchar(255),
    modify_time  datetime,
    primary key (tid)
) engine = InnoDB
create table user
(
    uid         int         not null not null auto_increment,
    college     varchar(50),
    create_time datetime,
    email       varchar(50),
    gender      tinyint,
    head        varchar(255),
    id_card     varchar(50),
    lastname    varchar(50),
    major       varchar(50),
    modify_time datetime,
    password    varchar(50) not null,
    phone       varchar(50),
    username    varchar(50) not null,
    primary key (uid)
) engine = InnoDB
alter table college_list
    add constraint FKmsmqi1n1rqcr79sveucw93sff foreign key (college_data_id) references college_data (id)
