import { Module } from "@nestjs/common";
import { CalculatorController } from "./calculator.controller";

@Module({
  controllers: [CalculatorController],
})
export class CalculatorModule {}
