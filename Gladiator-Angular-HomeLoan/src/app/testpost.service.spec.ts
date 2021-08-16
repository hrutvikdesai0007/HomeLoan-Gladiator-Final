import { TestBed } from '@angular/core/testing';

import { TestpostService } from './testpost.service';

describe('TestpostService', () => {
  let service: TestpostService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TestpostService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
