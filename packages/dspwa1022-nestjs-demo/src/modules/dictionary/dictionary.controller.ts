import {
  Body,
  Controller,
  Get,
  ParseIntPipe,
  Post,
  Query,
} from "@nestjs/common";
import { DictionaryService } from "./dictionary.service";
import { getRandomWord } from "src/utils/random";
import { CreateCustomWordDto, CustomWord } from "./model/custom-word";

@Controller("dictionary")
export class DictionaryController {
  constructor(private readonly dictionaryService: DictionaryService) {}

  @Get("alphabet")
  alphabet(): string[] {
    return this.dictionaryService.getAlphabet();
  }

  @Get("random-word")
  randomWord(
    @Query(
      "length",
      new ParseIntPipe({
        optional: true,
      }),
    )
    length = 10,
  ) {
    return getRandomWord(length);
  }

  @Post("custom-word")
  storeCustomWord(@Body() payload: CreateCustomWordDto): CustomWord[] {
    this.dictionaryService.storeCustomWord(payload);
    return this.dictionaryService.getCustomWords();
  }
}
