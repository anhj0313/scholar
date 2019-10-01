select * from LECTURE;
select user_id, password from USER_INFO;
update USER_INFO set password='0000' where user_id = '14010864' 
create sequence seq_request
select seq_request.nextval from dual
insert into user_info values('122148', '이준형', '컴퓨터공학', 8, '휴학', '서울 광진구', '010-8662-6860', '0000', '', 2)