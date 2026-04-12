import { Component, OnInit } from '@angular/core';
import { Comments } from '../comments';
import { NgForOf } from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [
    NgForOf
  ],
  templateUrl: './home.html',
  styleUrl: './home.scss',
})
export class Home implements OnInit{
  allComments: any;
  constructor(private service: Comments) {
  }
  ngOnInit(): void {
    this.service.callCommentsEndpoint().subscribe(value => {
      this.allComments = value;
      console.log(value);
    });
  }


}
