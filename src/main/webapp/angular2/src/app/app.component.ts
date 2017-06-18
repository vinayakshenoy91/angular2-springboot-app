import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms'


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css', '../../../node_modules/bootstrap/dist/css/bootstrap.min.css']
})

export class AppComponent implements OnInit {
  public submitted: boolean;
  roomSearch: FormGroup;
  rooms: Room[];

  ngOnInit() {
    this.roomSearch = new FormGroup({
      checkin: new FormControl(''),
      checkout: new FormControl('')
    });

    this.rooms = ROOMS;

  }

  onSubmit({ value, valid }: { value: RoomSearch, valid: boolean }) {
    console.log(value);
  }

  reserveRoom(value: string) {

    console.log(value);
  }

}

export interface RoomSearch {
  checkin: string;
  checkout: string;
}

export interface Room {
  id: string;
  roomNumber: string;
  price: string;
  links: string;
}

var ROOMS: Room[] = [

  {

    'id': '123',
    'roomNumber': '12345',
    'price': '1234',
    'links': 'https://www.google.com'

  }, {

    'id': '122',
    'roomNumber': '12341',
    'price': '133',
    'links': 'https://www.google.com'

  }




]




