import { IsNumber, IsString } from 'class-validator';

export interface Product {
    id: string;
    created_at: Date;
    name: string;
    price: number;
}

export class CreateProductDto {
    @IsString()
    name: string;

    @IsNumber()
    price: number;
}
