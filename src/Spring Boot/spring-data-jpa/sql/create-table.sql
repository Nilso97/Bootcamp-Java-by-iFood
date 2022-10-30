-- Table: tb_users

-- DROP TABLE tb_users;

CREATE TABLE tb_users
(
  user_id serial NOT NULL,
  name character varying(50) NOT NULL,
  password character varying(100) NOT NULL,
  username character varying(20) NOT NULL,
  CONSTRAINT tb_users_pkey PRIMARY KEY (user_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_users
  OWNER TO postgres;