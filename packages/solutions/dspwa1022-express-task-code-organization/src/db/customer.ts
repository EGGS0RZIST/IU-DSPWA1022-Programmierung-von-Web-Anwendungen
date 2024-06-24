import { Customer } from "../model/customer";
import { query } from "./pool";

export async function getCustomer(id: string): Promise<Customer> {
    const customers = await query<Customer>('select * from dspwa1022.customer where id = $1', [id]);
    return customers.rows[0];
}

export async function getCustomers(): Promise<Customer[]> {
    const customers = await query<Customer>('select * from dspwa1022.customer');
    return customers.rows;
}
