CREATE TABLE MESSAGE(
                        ID BIGINT(20) NOT NULL AUTO_INCREMENT,
                        TEXT VARCHAR(255) NULL DEFAULT NULL,
                        PRIMARY KEY (ID)

 );

select
    m.ID,
    m.`TEXT`
from
    MESSAGE m;


select * from MESSAGE;