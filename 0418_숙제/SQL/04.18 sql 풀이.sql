1번
select 
count(car_number)
from car_information

2번
select
d.device_uuid ,
d.battery ,
d.create_at 
from car_information ci 
inner join devices d 
on ci.device_uuid = d.device_uuid 

3번
insert into devices 
(device_uuid, battery, firmware_ver, is_use)
values
('20130099', 100, '1.0.1', 1)

4번
select
d.device_uuid,
d.firmware_ver 
from devices d
inner join car_information ci 
on d.device_uuid = ci.device_uuid 
right join car_event_log cel 
on ci.car_number = cel.car_number 
where cel.event_type  >=date_format(cel.create_at,"2022-04-11")

5번
select 
date(create_at),
count(event_type) 
from car_event_log
group by date(create_at) 


6번
select 
count(d.device_uuid),
count(ci.device_uuid)
from devices d 
left join car_information ci 
on d.device_uuid = ci.device_uuid  

7번
select count(*)
from car_event_log
where car_number = "359서 9096"
and create_at between "2022-04-11" and "2022-04-13"
group by event_type 

8번
select 
cel.event_type ,
cel.create_at ,
ci.car_number,
ci.admin_name 
from car_information ci 
inner join car_event_log cel 
on ci.car_number = cel.car_number
where ci.device_uuid = '20133344'
and cel.create_at  between '2022-04-11' and '2022-04-13'