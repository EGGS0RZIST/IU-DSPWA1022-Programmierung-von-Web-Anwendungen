import {
  Controller,
  Get,
  ParseBoolPipe,
  ParseFloatPipe,
  Query,
} from "@nestjs/common";
import { getRandomFloat } from "src/utils/random";

@Controller("calculator")
export class CalculatorController {
  @Get("add")
  add(
    @Query("a", new ParseFloatPipe()) a: number,
    @Query("b", new ParseFloatPipe()) b: number,
    @Query("randomize", new ParseBoolPipe({ optional: true }))
    randomize = false,
  ) {
    return {
      result: a + b + (randomize ? this.getRandomNumber() : 0),
    };
  }

  @Get("subtract")
  subtract(
    @Query("a", new ParseFloatPipe()) a: number,
    @Query("b", new ParseFloatPipe()) b: number,
    @Query("randomize", new ParseBoolPipe({ optional: true }))
    randomize = false,
  ) {
    return {
      result: a - b + (randomize ? this.getRandomNumber() : 0),
    };
  }

  @Get("multiply")
  multiply(
    @Query("a", new ParseFloatPipe()) a: number,
    @Query("b", new ParseFloatPipe()) b: number,
    @Query("randomize", new ParseBoolPipe({ optional: true }))
    randomize = false,
  ) {
    return {
      result: a * b + (randomize ? this.getRandomNumber() : 0),
    };
  }

  @Get("divide")
  divide(
    @Query("a", new ParseFloatPipe()) a: number,
    @Query("b", new ParseFloatPipe()) b: number,
    @Query("randomize", new ParseBoolPipe({ optional: true }))
    randomize = false,
  ) {
    return {
      result: a / b + (randomize ? this.getRandomNumber() : 0),
    };
  }

  private getRandomNumber(): number {
    return getRandomFloat(0, 100);
  }
}
