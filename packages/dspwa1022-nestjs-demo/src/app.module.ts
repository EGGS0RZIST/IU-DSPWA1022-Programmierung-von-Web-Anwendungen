import { Module } from "@nestjs/common";
import { DictionaryModule } from "./modules/dictionary/dictionary.module";
import { CalculatorModule } from "./modules/calculator/calculator.module";
import { TypeOrmModule } from "@nestjs/typeorm";
import { Customer } from "./modules/store/entities/customer";
import { StoreModule } from "./modules/store/store.module";

@Module({
  imports: [
    TypeOrmModule.forRoot({
      type: "postgres",
      host: process.env.DB_HOST,
      port: 5432,
      username: process.env.DB_USER,
      password: process.env.DB_PASSWORD,
      database: process.env.DB_DATABASE,
      ssl: true,
      entities: [Customer],
    }),
    CalculatorModule,
    DictionaryModule,
    StoreModule,
  ],
})
export class AppModule {}
