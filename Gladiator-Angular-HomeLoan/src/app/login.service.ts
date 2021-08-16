import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable, observable } from "rxjs";
import { Login } from "./Login";


@Injectable({
    providedIn:'root'
})
export class LoginService{
    baseUrl : String = 'http://localhost:8090/debtor/'
    constructor(private myhttp: HttpClient){}
    login(debtorid:number, password:String):Observable<Login[]>{
        return this.myhttp.get<Login[]>(this.baseUrl+"getdebt/"+debtorid+"/"+password);
    }
}