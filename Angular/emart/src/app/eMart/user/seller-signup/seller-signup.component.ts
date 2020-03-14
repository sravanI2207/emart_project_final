import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmartService } from '../../emart.service';
import { Seller } from '../../seller';

@Component({
  selector: 'app-seller-signup',
  templateUrl: './seller-signup.component.html',
  styleUrls: ['./seller-signup.component.css']
})
export class SellerSignupComponent implements OnInit {

	username:string='';
	password:string='';
	company:string='';
	brief:string='';
	gst:number;
	address:string='';
	email:string='';
	contact:number;
  website:string='';
  seller:any;
  constructor(protected router: Router,protected emartService: EmartService) { }

  ngOnInit(): void {
  }

  addSeller(){
    
    let seller:Seller = {
      id:0,
      username:this.username,
      password:this.password,
      company:this.company,
      brief:this.brief,
      gst:this.gst,
      address:this.address,
      email:this.email,
      contact:this.contact,
      website:this.website
      
     
    }
    this.emartService.addSeller(seller).subscribe(
      (response:any)=>{
        //this.seller.push(response);
      }
    );

    this.router.navigate(['/seller-item']);
    }

    

}
