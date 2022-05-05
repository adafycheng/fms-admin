create database fitness;

-- Check created tables --
select * from t_card;
select * from t_qicai;
select * from t_user;
select * from t_zhijiao;

-- Insert records --
INSERT INTO t_user (user_id, user_name, user_pw, user_type, user_realname) VALUES (1, 'admin', 'admin', 0, 'Administrator');