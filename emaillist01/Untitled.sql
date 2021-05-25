
use webdb;

select no, first_name, last_name, email from emaillist01 order by no desc;

delete from emaillist01 where no=?;

insert
	into emaillist01
values(null,'둘','리', 'dooly@gmail.com')
