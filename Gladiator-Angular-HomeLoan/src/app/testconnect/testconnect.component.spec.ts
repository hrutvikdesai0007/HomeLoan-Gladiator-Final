import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestconnectComponent } from './testconnect.component';

describe('TestconnectComponent', () => {
  let component: TestconnectComponent;
  let fixture: ComponentFixture<TestconnectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestconnectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TestconnectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
