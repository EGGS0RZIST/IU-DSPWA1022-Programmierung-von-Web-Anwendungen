import { Pool, QueryResult, QueryResultRow } from 'pg';

const pool = new Pool({
    host: process.env.DB_HOST,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    database: process.env.DB_DATABASE,
    ssl: true
});

/**
 * Use this function to send queries to the database
 */
export async function query<T extends QueryResultRow>(text: string, params: any[] = []): Promise<QueryResult<T>> {
    return await pool.query<T>(text, params);
}
