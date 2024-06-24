import { IsString, MinLength } from "class-validator";

export class CustomWord {
  id: string;
  word: string;
  meaning: string;
  created_at: Date;

  constructor(word: string, meaning: string) {
    this.id = Math.random().toString(36);
    this.word = word;
    this.meaning = meaning;
    this.created_at = new Date();
  }
}

export class CreateCustomWordDto {
  @IsString()
  word: string;

  @IsString()
  @MinLength(10)
  meaning: string;
}
