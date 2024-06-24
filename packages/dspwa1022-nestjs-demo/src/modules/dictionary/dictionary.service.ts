import { Injectable } from "@nestjs/common";
import { CreateCustomWordDto, CustomWord } from "./model/custom-word";

@Injectable()
export class DictionaryService {
  private readonly customWords: CustomWord[] = [];

  getAlphabet(): string[] {
    return Array.from("abcdefghijklmnopqrstuvwxyz");
  }

  storeCustomWord(dto: CreateCustomWordDto): void {
    const word = new CustomWord(dto.word, dto.meaning);
    this.customWords.push(word);
  }

  getCustomWords(): CustomWord[] {
    return this.customWords;
  }
}
