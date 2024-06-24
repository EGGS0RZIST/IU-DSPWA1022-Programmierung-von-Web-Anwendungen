import { Module } from "@nestjs/common";
import { DictionaryController } from "./dictionary.controller";
import { DictionaryService } from "./dictionary.service";

@Module({
  providers: [DictionaryService],
  controllers: [DictionaryController],
})
export class DictionaryModule {}
