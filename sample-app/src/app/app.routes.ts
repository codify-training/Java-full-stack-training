import { Routes } from '@angular/router';
import { Signin } from '../pages/signin/signin';
import { Home } from '../pages/home/home';
import { Child } from '../components/child/child';

export const routes: Routes = [
    {
        path: 'login', component: Signin
    },

    // default route which will be called when app is started
    {
        path: '', redirectTo: 'home', pathMatch: 'full'
    },
    {
        path:'view/product/:id', component:Child
    },
    {
        path: 'home', component: Home
    }
];
