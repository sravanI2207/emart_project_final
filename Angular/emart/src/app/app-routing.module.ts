import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemListComponent } from './eMart/item/item-list/item-list.component';
import { ItemDisplayComponent } from './eMart/item/item-display/item-display.component';
import { CartListComponent } from './eMart/cart/cart-list/cart-list.component';
import { BillViewComponent } from './eMart/bill/bill-view/bill-view.component';
import { BillListComponent } from './eMart/bill/bill-list/bill-list.component';
import { LoginComponent } from './eMart/user/login/login.component';
import { BuyerSignupComponent } from './eMart/user/buyer-signup/buyer-signup.component';
import { SellerSignupComponent } from './eMart/user/seller-signup/seller-signup.component';
import { LogoutComponent } from './user/logout/logout.component';
import { AuthGuard } from './auth.guard';
import { SellerItemComponent } from './emart/item/seller-item/seller-item.component';


const routes: Routes = [{
  path: 'login',
  component: LoginComponent,
},

{
  path: 'buyer-signup',
  component: BuyerSignupComponent
},
{
  path: 'seller-signup',
  component: SellerSignupComponent
},
{
  path: 'seller-item',
  component: SellerItemComponent
},
{
  path: 'item-list',
  component: ItemListComponent,
  canActivate: [AuthGuard]
},
{
  path: 'item-display/:iId',
  component: ItemDisplayComponent,
  canActivate: [AuthGuard]

},
{
  path:'cart-list',
  component: CartListComponent,
  canActivate: [AuthGuard]
},
{
path: 'bill-view',
component: BillViewComponent,
canActivate: [AuthGuard]
},

{
  path: 'bill-list',
  component: BillListComponent,
  canActivate: [AuthGuard]
  },
  {
    path: 'logout',
    component: LogoutComponent,
    canActivate: [AuthGuard]
  }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]


})
export class AppRoutingModule { }
