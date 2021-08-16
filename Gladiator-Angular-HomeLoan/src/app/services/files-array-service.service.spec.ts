import { TestBed } from '@angular/core/testing';

import { FilesArrayServiceService } from './files-array-service.service';

describe('FilesArrayServiceService', () => {
  let service: FilesArrayServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FilesArrayServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
