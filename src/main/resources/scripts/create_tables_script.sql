
CREATE TABLE "public"."accessory" (
   id int PRIMARY KEY NOT NULL,
   name varchar(255) NOT NULL,
   price numeric(10,2) NOT NULL,
   color varchar(20),
   manufacturer text NOT NULL,
   material text NOT NULL,
   accessories_category text NOT NULL
);

CREATE TABLE "public"."phone"(
   id int PRIMARY KEY NOT NULL,
   name varchar(255) NOT NULL,
   price numeric(10,2) NOT NULL,
   color varchar(20),
   cpu varchar(100),
   ram smallint,
   display_resolution real,
   manufacturer text NOT NULL,
   material text NOT NULL
);