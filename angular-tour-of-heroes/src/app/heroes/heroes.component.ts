import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero';
import { HEROES } from '../mock-heroes';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {
  // Add a heroes property to the class that exposes these heroes for binding.
  heroes = HEROES;

  // Add the click event handler
  // Rename the component's hero property to selectedHero but don't assign it. There is no selected hero when the application starts.
  // Add the following onSelect() method, which assigns the clicked hero from the template to the component's selectedHero.
  selectedHero: Hero;

  constructor() { }

  ngOnInit() {
  }

  onSelect(hero: Hero): void {
    this.selectedHero = hero;
  }

}
