import { Component, OnInit } from '@angular/core';
import { Buyer } from '../../buyer';
import { Router, ActivatedRoute } from '@angular/router';
import { EmartService } from '../../emart.service';

@Component({
  selector: 'app-buyer-signup',
  templateUrl: './buyer-signup.component.html',
  styleUrls: ['./buyer-signup.component.css']
})
export class BuyerSignupComponent implements OnInit {
  id:null;
  username:string='';
  password:string='';
  email:string='';
  mobile:number;
  date:Date = new Date();
 buyer:any;
  
  constructor(protected router: Router,protected emartService: EmartService) {
    this.buyer={
      
    }
   }

  ngOnInit(): void {
  }
    addBuyer(){
    
      let buyer:Buyer = {
        id:0,
        username:this.username,
        password:this.password,
        email:this.email,
        mobile:this.mobile,
        date:this.date
       
      }
      this.emartService.addBuyer(buyer).subscribe(
        (response:any)=>{
          //this.buyer.push(response);
        }
      );

      this.router.navigate(['/login']);
      }
}

