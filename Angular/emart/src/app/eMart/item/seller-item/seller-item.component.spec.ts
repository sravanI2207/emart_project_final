import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SellerItemComponent } from './seller-item.component';

describe('SellerItemComponent', () => {
  let component: SellerItemComponent;
  let fixture: ComponentFixture<SellerItemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SellerItemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SellerItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
