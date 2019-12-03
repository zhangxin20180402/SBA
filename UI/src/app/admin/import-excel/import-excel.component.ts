import { Component, OnInit } from '@angular/core';

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

  constructor(private fileService: FileService) { }

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
      //this.uploadedFiles.value = '';
      if (response instanceof HttpResponse) {
        //this.msg = response.body;
        console.log(response.body);
      }
    });
  }

}
