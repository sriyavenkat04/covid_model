clear all;
load cases.csv
load deaths.csv
cases = cases(1:end-1);
% cases = cases(2:end)-cases(1:end-1);


params.N = 10490000;
params.beta = 1.6;
params.c = 0.9;
params.theta = 0.3;
params.alpha = 0.6;
params.epsilon = 0.5;
params.gamma1 = 0.2;
params.mu = 0.01;
params.kappa = 0.8;
params.gamma2 = 1.2;
params.gamma3 = 0.9;
params.rho = 0.7;
params.gamma4 = 0.3;
params.gamma5 = 0.2;
ode = @(t, y) rhs(y, params);
%@ is anon function.returns sir rhs (defined at the bottom) 
E0 = 1000000000;
y0 = [params.N - E0-70;E0;10;10;10;10;10;10;10];
%initial conditions for S I and R
tspan = [0,490];
%solving from t=0 to t=10
[t,y] = ode15s(ode, tspan, y0);

figure()
hold on
plot(t,y(:,end))
scatter(0:7:490,cases)
% legend(["$S$", "$E$", "$A$", "$I$", "$Q$", "$H$", "$V$", "$R$"], "Interpreter","latex")
title("New Model")
xlabel("$t$")

% function res = objective(params, data)
%     p.beta = params(1);
%     p.c = params(2);
%     p.theta = params(3);
%     p.alpha = params(4);
%     p.epsilon = params(5);
%     p.gamma1 = params(6);
%     p.mu = params(7);
%     p.kappa = params(8);
%     p.gamma2 = params(9);
%     p.gamma3 = params(10);
%     p.rho = params(11);
%     p.gamma4 = params(12);
%     p.muH = params(13); 
%     ode = @(t, y) rhs(y, p);
%     I0 = .4;
%     y0 = [.1; I0; .050; .050; .100; .025; .200; .075; p.kappa*I0]*10000000;
% 
%     tspan = 0:490;
%     
%     [~,y] = ode45(ode, tspan, y0);
%     sir_cases = y(:,5);
% %     sir_cases = [0; sir_cases(1:end)];
% %     sir_cases = sir_cases(2:end)-sir_cases(1:end-1);
% %     size(sir_cases(1:7:end))
%     res = data - sir_cases(1:7:end);
%     res = res'*res;
% end


function dxdt = rhs(x, params)
beta = params.beta;
N = params.N;
c = params.c;
theta = params.theta;
alpha = params.alpha;
epsilon = params.epsilon;
gamma1 = params.gamma1;
mu = params.mu;
kappa = params.kappa;
gamma2 = params.gamma2;
gamma3 = params.gamma3;
rho = params.rho;
gamma4 = params.gamma4;
gamma5 = params.gamma5;
lambda = beta*(x(3)+c*x(4))/(x(1)+x(2)+x(3)+x(4)+x(7)+x(8));
% the above three are elements of the param list
dxdt(1) = -(lambda + theta)*x(1);
dxdt(2) = lambda*x(1) - alpha*x(2);
dxdt(3) = alpha*epsilon*x(2) - gamma1*x(3);
dxdt(4) = alpha*(1-epsilon)*x(2) - (mu + kappa +gamma2)*x(4);
dxdt(5) = kappa*x(4) - (gamma3 + rho +mu)*x(5);
dxdt(6) = rho*x(6) - (mu*x(6) +gamma4)*x(6);
dxdt(7) = theta*x(1) - gamma5*x(7);
dxdt(8) = gamma1*x(3) + gamma2*x(4) + gamma3*x(5) + gamma4*x(6) + gamma5*x(7);
dxdt(9) = mu*(x(4)+x(5)) + mu*x(6);
dxdt = dxdt';
% sir_rhs using x1 and x2 which are S and I respectively (x3 is R)
end
