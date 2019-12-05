import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';

import { FileService } from '../../service/file.service';
import * as $ from 'jquery';
import { HttpResponse } from '@angular/common/http';

@Component({
  selector: 'app-import-excel',
  templateUrl: './import-excel.component.html',
  styleUrls: ['./import-excel.component.css']
})
export class ImportExcelComponent implements OnInit {

  uploadedFiles: Array<File>;

  currentFile: File;

  fileName = "";

  msg = "";

  constructor(private fileService: FileService, private router: Router) { }

  ngOnInit() {
  }

  fileChange(element) {
    this.uploadedFiles = element.target.files;
    this.fileName = this.uploadedFiles[0].name;
  }

  selectFile() {
    $("#file").trigger('click');
  }

  upload() {

    this.currentFile = this.uploadedFiles[0];
    this.fileService.uploadFile(this.currentFile).subscribe(response => {
      if (response instanceof HttpResponse) {
        console.log(response.body);
        this.router.navigate(['admin/uploadSummary'], { state: response.body })
      }
    });
  }

}
