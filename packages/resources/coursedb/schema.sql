begin;

revoke all privileges on schema dspwa1022 from student;

revoke all privileges on all tables in schema dspwa1022 from student;

grant usage on schema dspwa1022 to student;

grant
select,
insert
,
update on all tables in schema dspwa1022 to student;

alter default privileges in schema dspwa1022
grant
select,
insert
,
update on tables to student;

create extension if not exists "uuid-ossp";

drop schema if exists dspwa1022 cascade;

create schema dspwa1022;

drop table if exists dspwa1022.product;

create table dspwa1022.product (
    id uuid primary key default gen_random_uuid (),
    created_at timestamptz not null default now(),
    name text not null,
    price float not null
);

drop table if exists dspwa1022.customer;

create table dspwa1022.customer (
    id uuid primary key default gen_random_uuid (),
    created_at timestamptz not null default now(),
    name text not null,
    email text not null
);

drop table if exists dspwa1022.order;

create table dspwa1022.order (
    id uuid primary key default gen_random_uuid (),
    customer uuid not null references dspwa1022.customer,
    created_at timestamptz not null default now()
);

drop table if exists dspwa1022.order_item;

create table dspwa1022.order_item (
    id uuid primary key default gen_random_uuid (),
    created_at timestamptz not null default now(),
    "order" uuid not null references dspwa1022.order,
    product uuid not null references dspwa1022.product,
    quantity float not null
);

-- Generate demo data for product table
insert into
    dspwa1022.product (id, name, price)
values (
        '00000000-0000-0000-0000-000000000001',
        'Book',
        10.99
    ),
    (
        '00000000-0000-0000-0000-000000000002',
        'T-Shirt',
        19.99
    ),
    (
        '00000000-0000-0000-0000-000000000003',
        'Bottle',
        5.99
    ),
    (
        '00000000-0000-0000-0000-000000000013',
        'Cap',
        8.99
    ),
    (
        '00000000-0000-0000-0000-000000000014',
        'Bag',
        12.99
    );

-- Generate demo data for customer table
insert into
    dspwa1022.customer (id, name, email)
values (
        '00000000-0000-0000-0000-000000000004',
        'John Doe',
        'john.doe@example.com'
    ),
    (
        '00000000-0000-0000-0000-000000000005',
        'Jane Smith',
        'jane.smith@example.com'
    ),
    (
        '00000000-0000-0000-0000-000000000006',
        'Bob Johnson',
        'bob.johnson@example.com'
    ),
    (
        '00000000-0000-0000-0000-000000000015',
        'Alice Johnson',
        'alice.johnson@example.com'
    ),
    (
        '00000000-0000-0000-0000-000000000016',
        'Michael Brown',
        'michael.brown@example.com'
    );

-- Generate demo data for order table
insert into
    dspwa1022.order (id, customer, created_at)
values (
        '00000000-0000-0000-0000-000000000007',
        '00000000-0000-0000-0000-000000000004',
        '2024-04-04'
    ),
    (
        '00000000-0000-0000-0000-000000000008',
        '00000000-0000-0000-0000-000000000005',
        '2024-04-06'
    ),
    (
        '00000000-0000-0000-0000-000000000009',
        '00000000-0000-0000-0000-000000000006',
        '2024-04-24'
    ),
    (
        '00000000-0000-0000-0000-000000000017',
        '00000000-0000-0000-0000-000000000015',
        '2024-05-04'
    ),
    (
        '00000000-0000-0000-0000-000000000018',
        '00000000-0000-0000-0000-000000000016',
        '2024-05-13'
    ),
    (
        '00000000-0000-0000-0000-000000000021',
        '00000000-0000-0000-0000-000000000004',
        '2024-05-13'
    ),
    (
        '00000000-0000-0000-0000-000000000022',
        '00000000-0000-0000-0000-000000000005',
        '2024-06-01'
    ),
    (
        '00000000-0000-0000-0000-000000000100',
        '00000000-0000-0000-0000-000000000005',
        '2024-06-02'
    );

-- Generate demo data for order_item table
insert into
    dspwa1022.order_item (
        id,
        "order",
        product,
        quantity
    )
values (
        '00000000-0000-0000-0000-000000000010',
        '00000000-0000-0000-0000-000000000007',
        '00000000-0000-0000-0000-000000000001',
        2
    ),
    (
        '00000000-0000-0000-0000-000000000011',
        '00000000-0000-0000-0000-000000000008',
        '00000000-0000-0000-0000-000000000002',
        1
    ),
    (
        '00000000-0000-0000-0000-000000000012',
        '00000000-0000-0000-0000-000000000009',
        '00000000-0000-0000-0000-000000000003',
        3
    ),
    (
        '00000000-0000-0000-0000-000000000019',
        '00000000-0000-0000-0000-000000000017',
        '00000000-0000-0000-0000-000000000013',
        2
    ),
    (
        '00000000-0000-0000-0000-000000000020',
        '00000000-0000-0000-0000-000000000018',
        '00000000-0000-0000-0000-000000000014',
        1
    ),
    (
        '00000000-0000-0000-0000-000000000101',
        '00000000-0000-0000-0000-000000000100',
        '00000000-0000-0000-0000-000000000001',
        1
    );

drop table if exists dspwa1022.parcel;

create table dspwa1022.parcel (
    id uuid primary key default gen_random_uuid (),
    created_at timestamptz not null default now(),
    "order" uuid not null references dspwa1022.order,
    weight_kg float not null,
    length_m float,
    width_m float,
    height_m float
);

drop table if exists dspwa1022.parcel_event;

create table dspwa1022.parcel_event (
    id uuid primary key default gen_random_uuid (),
    created_at timestamptz not null default now(),
    parcel uuid not null references dspwa1022.parcel,
    event_type text not null,
    event_description text
);

commit;
