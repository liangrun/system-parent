CREATE TABLE lgoin 
    ( 
     login_id NUMBER  NOT NULL , 
     username NVARCHAR2 (32)  NOT NULL , 
     passWord NVARCHAR2 (64)  NOT NULL 
    ) 
;
commit;
ALTER TABLE lgoin  ADD CONSTRAINT lgoin_PK PRIMARY KEY ( login_id ) ;
commit;
create sequence test_login_seq
increment by 1
start with 1
minvalue 1 nomaxvalue;
commit;

    
