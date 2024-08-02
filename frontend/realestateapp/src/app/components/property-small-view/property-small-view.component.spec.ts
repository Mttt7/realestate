import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropertySmallViewComponent } from './property-small-view.component';

describe('PropertySmallViewComponent', () => {
  let component: PropertySmallViewComponent;
  let fixture: ComponentFixture<PropertySmallViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PropertySmallViewComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PropertySmallViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
