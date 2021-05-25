
use webdb;

select no, first_name, last_name, email from emaillist01 order by no desc;

delete from emaillist01 where no=?;

insert
	into emaillist01
values(null,'둘','리', 'dooly@gmail.com');




-- schme

use webdb;

desc guestbook01;
delete from guestbook01 where name='희경님';

select count(no), no, name, password, message ,reg_date from guestbook01 group by no;
select count(no) from guestbook01;

