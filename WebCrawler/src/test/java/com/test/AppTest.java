package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.webcrawler.models.Product;
import com.webcrawler.models.Products;
import com.webcrawler.utilities.SpiderUtility;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String argsp[]) throws JAXBException
	{
		String pageSource = "\r\n" + 
				"<!doctype html><html class=\"a-no-js\" data-19ax5a9jf=\"dingo\"><head><script>var aPageStart = (new Date()).getTime();</script><meta charset=\"utf-8\"><title dir=\"ltr\">If on Tight budget - Need a phone for calls, WhatsApp, etc. - you are in the right place - REDMI 6A</title>\r\n" + 
				"<script type='text/javascript'>var ue_t0=ue_t0||+new Date();</script>\r\n" + 
				"<script type='text/javascript'>\r\n" + 
				"window.ue_ihb = (window.ue_ihb || window.ueinit || 0) + 1;\r\n" + 
				"if (window.ue_ihb === 1) {\r\n" + 
				"\r\n" + 
				"var ue_csm = window,\r\n" + 
				"    ue_hob = +new Date();\r\n" + 
				"(function(d){var e=d.ue=d.ue||{},f=Date.now||function(){return+new Date};e.d=function(b){return f()-(b?0:d.ue_t0)};e.stub=function(b,a){if(!b[a]){var c=[];b[a]=function(){c.push([c.slice.call(arguments),e.d(),d.ue_id])};b[a].replay=function(b){for(var a;a=c.shift();)b(a[0],a[1],a[2])};b[a].isStub=1}};e.exec=function(b,a){return function(){if(1==window.ueinit)try{return b.apply(this,arguments)}catch(c){ueLogError(c,{attribution:a||\"undefined\",logLevel:\"WARN\"})}}}})(ue_csm);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    var ue_err_chan = 'jserr-rw';\r\n" + 
				"(function(d,e){function h(f,b){if(!(a.ec>a.mxe)&&f){a.ter.push(f);b=b||{};var c=f.logLevel||b.logLevel;c&&c!==k&&c!==m&&c!==n&&c!==p||a.ec++;c&&c!=k||a.ecf++;b.pageURL=\"\"+(e.location?e.location.href:\"\");b.logLevel=c;b.attribution=f.attribution||b.attribution;a.erl.push({ex:f,info:b})}}function l(a,b,c,e,g){d.ueLogError({m:a,f:b,l:c,c:\"\"+e,err:g,fromOnError:1,args:arguments},g?{attribution:g.attribution,logLevel:g.logLevel}:void 0);return!1}var k=\"FATAL\",m=\"ERROR\",n=\"WARN\",p=\"DOWNGRADED\",a={ec:0,ecf:0,\r\n" + 
				"pec:0,ts:0,erl:[],ter:[],mxe:50,startTimer:function(){a.ts++;setInterval(function(){d.ue&&a.pec<a.ec&&d.uex(\"at\");a.pec=a.ec},1E4)}};l.skipTrace=1;h.skipTrace=1;h.isStub=1;d.ueLogError=h;d.ue_err=a;e.onerror=l})(ue_csm,window);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var ue_id = '53RX2GATRXV3PYFHQG9N',\r\n" + 
				"    ue_url = '/uedata/uedata',\r\n" + 
				"    ue_navtiming = 1,\r\n" + 
				"    ue_mid = 'A21TJRUUN4KGV',\r\n" + 
				"    ue_sid = '259-2484040-1898032',\r\n" + 
				"    ue_sn = 'www.amazon.in',\r\n" + 
				"    ue_furl = 'fls-eu.amazon.in',\r\n" + 
				"    ue_surl = 'https://unagi-eu.amazon.com/1/events/com.amazon.csm.nexusclient.prod',\r\n" + 
				"    ue_int = 0,\r\n" + 
				"    ue_fcsn = 1,\r\n" + 
				"    ue_urt = 3,\r\n" + 
				"    ue_rpl_ns = 'cel-rpl',\r\n" + 
				"    ue_ddq = 1,\r\n" + 
				"    ue_fpf = '//fls-eu.amazon.in/1/batch/1/OP/A21TJRUUN4KGV:259-2484040-1898032:53RX2GATRXV3PYFHQG9N$uedata=s:',\r\n" + 
				"    ue_rsc = 0,\r\n" + 
				"    ue_mcimp = 0,\r\n" + 
				"    ue_crid = 0,\r\n" + 
				"\r\n" + 
				"    ue_swi = 1;\r\n" + 
				"function ue_viz(){(function(c,e,a){function k(b){if(c.ue.viz.length<p&&!l){var a=b.type;b=b.originalEvent;/^focus./.test(a)&&b&&(b.toElement||b.fromElement||b.relatedTarget)||(a=e[m]||(\"blur\"==a||\"focusout\"==a?\"hidden\":\"visible\"),c.ue.viz.push(a+\":\"+(+new Date-c.ue.t0)),\"visible\"==a&&(ue.isl&&uex(\"at\"),l=1))}}for(var l=0,f,g,m,n=[\"\",\"webkit\",\"o\",\"ms\",\"moz\"],d=0,p=20,h=0;h<n.length&&!d;h++)if(a=n[h],f=(a?a+\"H\":\"h\")+\"idden\",d=\"boolean\"==typeof e[f])g=a+\"visibilitychange\",m=(a?a+\"V\":\"v\")+\"isibilityState\";\r\n" + 
				"k({});d&&e.addEventListener(g,k,0);c.ue&&d&&(c.ue.pageViz={event:g,propHid:f})})(ue_csm,document,window)};\r\n" + 
				"\r\n" + 
				"(function(a,g,n){function z(a){return a&&a.replace&&a.replace(/^\\s+|\\s+$/g,\"\")}function q(a){return\"undefined\"===typeof a}function A(a){try{a+=\"=\";var b=n.cookie.indexOf(a),c=n.cookie.indexOf(\";\",b+a.length);-1===c&&(c=n.cookie.length);if(0<=b)return n.cookie.substring(b+a.length,c).trim()}catch(l){}}function v(e,b,c,l){var g=l||+new Date,h;a.ueam&&a.ueam(b,e,l);if(b||q(c)){if(e)for(h in l=b?f(\"t\",b)||f(\"t\",b,{}):a.ue.t,l[e]=g,c)c.hasOwnProperty(h)&&f(h,b,c[h]);return g}}function f(e,b,c){var l=a.ue,\r\n" + 
				"f=b&&b!=l.id?l.sc[b]:l;f||(f=l.sc[b]={});\"id\"==e&&c&&(l.cfa2=1);return f[e]=c||f[e]}function C(e,b,c,f,g){c=\"on\"+c;var h=b[c];\"function\"===typeof h?e&&(a.ue.h[e]=h):h=function(){};b[c]=g?function(a){f(a);h(a)}:function(a){h(a);f(a)};b[c]&&(b[c].isUeh=1)}function D(e,b,c){function l(b,c){var d=[b],H=0,g={},l,h;c?(d.push(\"m=1\"),g[c]=1):g=a.ue.sc;for(h in g)if(g.hasOwnProperty(h)){var k=f(\"wb\",h),m=f(\"t\",h)||{},p=f(\"t0\",h)||a.ue.t0,n;if(c||2==k){k=k?H++:\"\";d.push(\"sc\"+k+\"=\"+h);for(n in m)3>=n.length&&\r\n" + 
				"!q(m[n])&&null!==m[n]&&d.push(n+k+\"=\"+(m[n]-p));d.push(\"t\"+k+\"=\"+m[e]);if(f(\"ctb\",h)||f(\"wb\",h))l=1}}!u&&l&&d.push(\"ctb=1\");return d.join(\"&\")}function B(b,c,d,e){if(b){var f=a.ue_err,h;a.ue_url&&(!e||!a.ue.log)&&b&&0<b.length&&(h=new Image,a.ue.iel.push(h),h.src=b);I?a.ue_fpf&&g.encodeURIComponent&&b&&(e=new Image,b=\"\"+a.ue_fpf+g.encodeURIComponent(b)+\":\"+(+new Date-a.ue_t0),a.ue.iel.push(e),e.src=b):a.ue.log&&(h=g.chrome&&\"ul\"==c,a.ue.log(b,\"uedata\",a.ue_svi?{n:1,img:!e&&h?1:0}:{n:1}),a.ue.ielf.push(b));\r\n" + 
				"f&&!f.ts&&f.startTimer();a.ue.b&&(f=a.ue.b,a.ue.b=\"\",B(f,c,d,1))}}function h(b){if(!ue.collected){var c=b.timing,e=b.navigation,d=ue.t;c&&(d.na_=c.navigationStart,d.ul_=c.unloadEventStart,d._ul=c.unloadEventEnd,d.rd_=c.redirectStart,d._rd=c.redirectEnd,d.fe_=c.fetchStart,d.lk_=c.domainLookupStart,d._lk=c.domainLookupEnd,d.co_=c.connectStart,d._co=c.connectEnd,d.sc_=c.secureConnectionStart,d.rq_=c.requestStart,d.rs_=c.responseStart,d._rs=c.responseEnd,d.dl_=c.domLoading,d.di_=c.domInteractive,d.de_=\r\n" + 
				"c.domContentLoadedEventStart,d._de=c.domContentLoadedEventEnd,d._dc=c.domComplete,d.ld_=c.loadEventStart,d._ld=c.loadEventEnd,c=d.na_,b=\"function\"!==typeof b.now||q(c)?0:new Date(c+b.now())-new Date,d.ntd=b+a.ue.t0);e&&(d.ty=e.type+a.ue.t0,d.rc=e.redirectCount+a.ue.t0);ue.collected=1}}function t(b){var c=r&&r.navigation?r.navigation.type:x,d=c&&2!=c,e=a.ue.bfini;a.ue.cfa2||(e&&1<e&&(b+=\"&bfform=1\",d||(a.ue.isBFT=e-1)),2==c&&(b+=\"&bfnt=1\",a.ue.isBFT=a.ue.isBFT||1),a.ue.ssw&&a.ue.isBFT&&(q(a.ue.isNRBF)&&\r\n" + 
				"(c=a.ue.ssw(a.ue.oid),c.e||q(c.val)||(a.ue.isNRBF=1<c.val?0:1)),q(a.ue.isNRBF)||(b+=\"&nrbf=\"+a.ue.isNRBF)),a.ue.isBFT&&!a.ue.isNRBF&&(b+=\"&bft=\"+a.ue.isBFT));return b}if(b||q(c)){for(var m in c)c.hasOwnProperty(m)&&f(m,b,c[m]);v(\"pc\",b,c);m=f(\"id\",b)||a.ue.id;var d=a.ue.url+\"?\"+e+\"&v=\"+a.ue.v+\"&id=\"+m,u=f(\"ctb\",b)||f(\"wb\",b),r=g.performance||g.webkitPerformance,k,p;u&&(d+=\"&ctb=\"+u);1<a.ueinit&&(d+=\"&ic=\"+a.ueinit);!a.ue._fi||\"at\"!=e||b&&b!=m||(d+=a.ue._fi());if(!(\"ld\"!=e&&\"ul\"!=e||b&&b!=m)){if(\"ld\"==\r\n" + 
				"e){try{g.onbeforeunload&&g.onbeforeunload.isUeh&&(g.onbeforeunload=null)}catch(y){}if(g.chrome)for(p=0;p<ue.ulh.length;p++)E(\"beforeunload\",ue.ulh[p]);(p=n.ue_backdetect)&&p.ue_back&&p.ue_back.value++;a._uess&&(k=a._uess());a.ue.isl=1}ue._bf&&(d+=\"&bf=\"+ue._bf());a.ue_navtiming&&r&&r.timing&&(f(\"ctb\",m,\"1\"),1==a.ue_navtiming&&v(\"tc\",x,x,r.timing.navigationStart));r&&h(r);a.ue.t.hob=a.ue_hob;a.ue.t.hoe=a.ue_hoe;a.ue.ifr&&(d+=\"&ifr=1\")}v(e,b,c);c=\"ld\"==e&&b&&f(\"wb\",b);var w;c||b&&b!==m||J(b);c||m==\r\n" + 
				"a.ue.oid||K((f(\"t\",b)||{}).tc||+f(\"t0\",b),+f(\"t0\",b));a.ue_mbl&&a.ue_mbl.cnt&&!c&&(d+=a.ue_mbl.cnt());c?f(\"wb\",b,2):\"ld\"==e&&(s.lid=z(m));for(w in a.ue.sc)if(1==f(\"wb\",w))break;if(c){if(a.ue.s)return;d=l(d,null)}else p=l(d,null),p!=d&&(p=t(p),a.ue.b=p),k&&(d+=k),d=l(d,b||a.ue.id);d=t(d);if(a.ue.b||c)for(w in a.ue.sc)2==f(\"wb\",w)&&delete a.ue.sc[w];k=0;ue._rt&&(d+=\"&rt=\"+ue._rt());c||(a.ue.s=0,(k=a.ue_err)&&0<k.ec&&k.pec<k.ec&&(k.pec=k.ec,d+=\"&ec=\"+k.ec+\"&ecf=\"+k.ecf),k=f(\"ctb\",b),f(\"t\",b,{}));d&&\r\n" + 
				"a.ue.tag&&0<a.ue.tag().length&&(d+=\"&csmtags=\"+a.ue.tag().join(\"|\"),a.ue.tag=a.ue.tagC());d&&a.ue.viz&&0<a.ue.viz.length&&(d+=\"&viz=\"+a.ue.viz.join(\"|\"),a.ue.viz=[]);d&&!q(a.ue_pty)&&(d+=\"&pty=\"+a.ue_pty+\"&spty=\"+a.ue_spty+\"&pti=\"+a.ue_pti);d&&a.ue.tabid&&(d+=\"&tid=\"+a.ue.tabid);d&&a.ue.aftb&&(d+=\"&aftb=1\");d&&a.ue.sbf&&(d+=\"&sbf=1\");!a.ue._ui||b&&b!=m||(d+=a.ue._ui());a.ue.a=d;B(d,e,k,c)}}function J(a){var b=g.ue_csm_markers||{},c;for(c in b)b.hasOwnProperty(c)&&v(c,a,x,b[c])}function t(e,b,c){c=\r\n" + 
				"c||g;a.ue_pel&&window.EventTarget&&window.EventTarget.prototype&&window.EventTarget.prototype.addEventListener?window.EventTarget.prototype.addEventListener.call(c,e,b,!!window.ue_clf):c.addEventListener?c.addEventListener(e,b,!!window.ue_clf):c.attachEvent&&c.attachEvent(\"on\"+e,b)}function E(e,b,c){c=c||g;a.ue_pel&&window.EventTarget&&window.EventTarget.prototype&&window.EventTarget.prototype.removeEventListener?window.EventTarget.prototype.removeEventListener.call(c,e,b,!!window.ue_clf):c.removeEventListener?\r\n" + 
				"c.removeEventListener(e,b,!!window.ue_clf):c.detachEvent&&c.detachEvent(\"on\"+e,b)}function F(){function e(){a.onUl()}function b(a){return function(){c[a]||(c[a]=1,D(a))}}var c=a.ue.r,f,q;a.onLd=b(\"ld\");a.onLdEnd=b(\"ld\");a.onUl=b(\"ul\");f={stop:b(\"os\")};g.chrome?(t(\"beforeunload\",e),ue.ulh.push(e)):f[L]=a.onUl;for(q in f)f.hasOwnProperty(q)&&C(0,g,q,f[q]);a.ue_viz&&ue_viz();M&&t(\"readystatechange\",N,n);t(\"load\",a.onLd);v(\"ue\")}function N(){\"complete\"===n.readyState&&(O?setTimeout(G,0):G())}function G(){var e;\r\n" + 
				"if(!(e=ue.isl)&&(e=P))a:{e=n.images||[];for(var b=0;b<e.length;b++)if(!1===e[b].complete){e=!1;break a}e=!0}if(!e)a.onUl()}function K(e,b){a.ue_mbl&&a.ue_mbl.ajax&&a.ue_mbl.ajax(e,b);a.ue.tag(\"ajax-transition\")}a.ueinit=(a.ueinit||0)+1;var s={t0:g.aPageStart||a.ue_t0,id:a.ue_id,url:a.ue_url,rid:a.ue_id,a:\"\",b:\"\",h:{},r:{ld:0,oe:0,ul:0},s:1,t:{},sc:{},iel:[],ielf:[],fc_idx:{},viz:[],v:\"0.201825.0\",d:a.ue&&a.ue.d,log:a.ue&&a.ue.log,clog:a.ue&&a.ue.clog,onflush:a.ue&&a.ue.onflush,onunload:a.ue&&a.ue.onunload,\r\n" + 
				"stub:a.ue&&a.ue.stub,lr:a.ue&&a.ue.lr,exec:a.ue&&a.ue.exec,event:a.ue&&a.ue.event,onSushiUnload:a.ue&&a.ue.onSushiUnload,onSushiFlush:a.ue&&a.ue.onSushiFlush,ulh:[],cfa2:0},I=a.ue_fpf?1:0,M=1===a.ue_rsc||3===a.ue_rsc,O=3===a.ue_rsc,P=1===a.ue_rsc,L=\"beforeunload\",x;if(1===a.ue_crid||2===a.ue_crid&&\"000-0000000-8675309\"===a.ue_sid){var u=A(\"cdn-rid\"),y=A(\"session-id\");u&&y&&(a.ue_fpf=a.ue_fpf.replace(a.ue_sid,y).replace(a.ue_id,u),a.ue_id=s.id=s.rid=u,a.ue_sid=y)}s.oid=z(s.id);s.lid=z(s.id);a.ue=s;\r\n" + 
				"a.ue._t0=a.ue.t0;a.ue.tagC=function(){var a={};return function(b){b&&(a[b]=1);b=[];for(var c in a)a.hasOwnProperty(c)&&b.push(c);return b}};a.ue.tag=a.ue.tagC();a.ue.ifr=g.top!==g.self||g.frameElement?1:0;ue.attach=t;ue.detach=E;ue.reset=function(e,b){e&&(a.ue_cel&&a.ue_cel.reset(),a.ue.t0=+new Date,a.ue.rid=e,a.ue.id=e,a.ue.fc_idx={},a.ue.viz=[])};a.uei=F;a.ueh=C;a.ues=f;a.uet=v;a.uex=D;F()})(ue_csm,window,ue_csm.document);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ue.stub(ue,\"log\");ue.stub(ue,\"onunload\");ue.stub(ue,\"onflush\");\r\n" + 
				"(function(b){var a=b.ue;a.cv={};a.cv.scopes={};a.count=function(c,b,d){var e={},f=a.cv;e.counter=c;e.value=b;e.t=a.d();d&&d.scope&&(f=a.cv.scopes[d.scope]=a.cv.scopes[d.scope]||{},e.scope=d.scope);if(void 0===b)return f[c];f[c]=b;c=0;d&&d.bf&&(c=1);!ue_csm.ue_sclog&&a.clog&&0===c?a.clog(e,\"csmcount\",{bf:c}):a.log&&a.log(e,\"csmcount\",{c:1,bf:c})};a.count(\"baselineCounter2\",1);a&&a.event&&(a.event({requestId:b.ue_id||\"rid\",server:b.ue_sn||\"sn\",obfuscatedMarketplaceId:b.ue_mid||\"mid\"},\"csm\",\"csm.CSMBaselineEvent.4\"),\r\n" + 
				"a.count(\"nexusBaselineCounter\",1,{bf:1}))})(ue_csm);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var ue_hoe = +new Date();\r\n" + 
				"}\r\n" + 
				"window.ueinit = window.ue_ihb;\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"<!-- 1am7p89qqpm9ww8jwz75lpvh --><link rel=\"stylesheet\" href=\"https://images-eu.ssl-images-amazon.com/images/I/61q3B0nT22L._RC|01evdoiemkL.css,01K+Ps1DeEL.css,31Dj+6BjA7L.css,11PuQQlCaSL.css,11UGC+GXOPL.css,21LK7jaicML.css,11L58Qpo0GL.css,21EuGTxgpoL.css,01Xl9KigtzL.css,01YhS3Cs-hL.css,21GwE3cR-yL.css,019SHZnt8RL.css,01gv-pABIRL.css,11vZhCgAHbL.css,21Mne54CsmL.css,11WgRxUdJRL.css,01dU8+SPlFL.css,11DGn6WmpTL.css,01SHjPML6tL.css,111-D2qRjiL.css,01QrWuRrZ-L.css,31VvBsfI8-L.css,114KWZGKCVL.css,01cbS3UK11L.css,21J5CLG82gL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI#not-trident\" />\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://images-eu.ssl-images-amazon.com/images/I/01OMgF7BuBL._RC|01npSbk2oUL.css,11vjwGfPA6L.css,01x1K0jaQnL.css,017IH9bX79L.css,313FMMLj3RL.css_.css?AUIClients/DesktopSRPMetaAsset#155248-T1.170181-T1.164381-T2.171327-T1\" />\r\n" + 
				"<script>\r\n" + 
				"(function(g,h,K,la){function V(a){t&&t.tag&&t.tag(q(\":\",\"aui\",a))}function v(a,b){t&&t.count&&t.count(\"aui:\"+a,0===b?0:b||(t.count(\"aui:\"+a)||0)+1)}function m(a){try{return a.test(navigator.userAgent)}catch(b){return!1}}function w(a,b,c){a.addEventListener?a.addEventListener(b,c,!1):a.attachEvent&&a.attachEvent(\"on\"+b,c)}function q(a,b,c,e){b=b&&c?b+a+c:b||c;return e?q(a,b,e):b}function B(a,b,c){try{Object.defineProperty(a,b,{value:c,writable:!1})}catch(e){a[b]=c}return c}function L(){return setTimeout(W,\r\n" + 
				"0)}function ma(a,b){var c=a.length,e=c,f=function(){e--||(M.push(b),N||(L(),N=!0))};for(f();c--;)X[a[c]]?f():(x[a[c]]=x[a[c]]||[]).push(f)}function na(a,b,c,e,f){var d=h.createElement(a?\"script\":\"link\");w(d,\"error\",e);f&&w(d,\"load\",f);if(a){d.type=\"text/javascript\";d.async=!0;if(a=c)a=-1!==b.indexOf(\"images/I\")||/AUIClients/.test(b);a&&d.setAttribute(\"crossorigin\",\"anonymous\");d.src=b}else d.rel=\"stylesheet\",d.href=b;h.getElementsByTagName(\"head\")[0].appendChild(d)}function Y(a,b){function c(c,e){function f(){na(b,\r\n" + 
				"c,h,function(b){!C&&h?(h=!1,v(\"resource_retry\"),f()):(v(\"resource_error\"),a.log(\"Asset failed to load: \"+c,C?\"WARN\":void 0));b&&b.stopPropagation?b.stopPropagation():g.event&&(g.event.cancelBubble=!0)},e)}if(Z[c])return!1;Z[c]=!0;v(\"resource_count\");var h=!0;return!f()}if(b){var e=0,f=0;c.andConfirm=function(a,b){return c(a,function(){e++;b&&b.apply(this,arguments)})};c.confirm=function(){f++};c.getCsriCounters=function(){return{reqs:e,full:f}}}return c}function oa(a,b,c){for(var e={name:a,guard:function(c){return b.guardFatal(a,\r\n" + 
				"c)},logError:function(c,d,e){b.logError(c,d,e,a)}},f=[],d=0;d<c.length;d++)D.hasOwnProperty(c[d])&&(f[d]=O.hasOwnProperty(c[d])?O[c[d]](D[c[d]],e):D[c[d]]);return f}function y(a,b,c,e,f){return function(d,h){function l(){var a=null;e?a=h:\"function\"===typeof h&&(p.start=z(),a=h.apply(g,oa(d,k,m)),p.end=z());if(b){D[d]=a;a=d;for(X[a]=!0;(x[a]||[]).length;)x[a].shift()();delete x[a]}p.done=!0}var k=f||this;\"function\"===typeof d&&(h=d,d=void 0);b&&(d=(d||\"__NONAME__\").replace(/^prv:/,\"\"),P.hasOwnProperty(d)&&\r\n" + 
				"k.error(q(\", reregistered by \",q(\" by \",d+\" already registered\",P[d]),k.attribution),d),P[d]=k.attribution);for(var m=[],n=0;n<a.length;n++)m[n]=a[n].replace(/^prv:/,\"\");var p=aa[d||\"anon\"+ ++pa]={depend:m,registered:z(),namespace:k.namespace};c?l():ma(m,k.guardFatal(d,l));return{decorate:function(a){O[d]=k.guardFatal(d,a)}}}}function ba(a){return function(){var b=Array.prototype.slice.call(arguments);return{execute:y(b,!1,a,!1,this),register:y(b,!0,a,!1,this)}}}function Q(a,b){return function(c,\r\n" + 
				"e){e||(e=c,c=void 0);var f=this.attribution;return function(){u.push(b||{attribution:f,name:c,logLevel:a});var d=e.apply(this,arguments);u.pop();return d}}}function E(a,b){this.load={js:Y(this,!0),css:Y(this)};B(this,\"namespace\",b);B(this,\"attribution\",a)}function ca(){h.body?n.trigger(\"a-bodyBegin\"):setTimeout(ca,20)}function A(a,b){if(b){for(var c=a.className.split(\" \"),e=c.length;e--;)if(c[e]===b)return;a.className+=\" \"+b}}function da(a,b){for(var c=a.className.split(\" \"),e=[],f;void 0!==(f=c.pop());)f&&\r\n" + 
				"f!==b&&e.push(f);a.className=e.join(\" \")}function ea(a){try{return a()}catch(b){return!1}}function F(){if(G){var a=g.innerWidth?{w:g.innerWidth,h:g.innerHeight}:{w:k.clientWidth,h:k.clientHeight};5<Math.abs(a.w-R.w)||50<a.h-R.h?(R=a,H=4,(a=l.mobile||l.tablet?450<a.w&&a.w>a.h:1250<=a.w)?A(k,\"a-ws\"):da(k,\"a-ws\")):0<H&&(H--,fa=setTimeout(F,16))}}function qa(a){(G=void 0===a?!G:!!a)&&F()}function ra(){return G}\"use strict\";var I=K.now=K.now||function(){return+new K},z=function(a){return a&&a.now?a.now.bind(a):\r\n" + 
				"I}(g.performance);la=z();var p=g.AmazonUIPageJS||g.P;if(p&&p.when&&p.register)throw Error(\"A copy of P has already been loaded on this page.\");var t=g.ue;V();V(\"aui_build_date:3.18.13-2018-09-26\");var M=[],N=!1,W;W=function(){for(var a=L(),b=I();M.length;)if(M.shift()(),50<I()-b)return;clearTimeout(a);N=!1};m(/OS 6_[0-9]+ like Mac OS X/i)&&w(g,\"scroll\",L);var X={},x={},Z={},C=!1;w(g,\"beforeunload\",function(){C=!0;setTimeout(function(){C=!1},1E4)});var P={},D={},O={},aa={},pa=0,S,u=[],ga=g.onerror;\r\n" + 
				"g.onerror=function(a,b,c,e,f){f&&\"object\"===typeof f||(f=Error(a,b,c),f.columnNumber=e,f.stack=b||c||e?q(String.fromCharCode(92),f.message,\"at \"+q(\":\",b,c,e)):void 0);var d=u.pop()||{};f.attribution=q(\":\",f.attribution||d.attribution,d.name);f.logLevel=d.logLevel;f.attribution&&console&&console.log&&console.log([f.logLevel||\"ERROR\",a,\"thrown by\",f.attribution].join(\" \"));u=[];ga&&(d=[].slice.call(arguments),d[4]=f,ga.apply(g,d))};E.prototype={logError:function(a,b,c,e){b={message:b,logLevel:c||\"ERROR\",\r\n" + 
				"attribution:q(\":\",this.attribution,e)};if(g.ueLogError)return g.ueLogError(a||b,a?b:null),!0;console&&console.error&&(console.log(b),console.error(a));return!1},error:function(a,b,c,e){a=Error(q(\":\",e,a,c));a.attribution=q(\":\",this.attribution,b);throw a;},guardError:Q(),guardFatal:Q(\"FATAL\"),guardCurrent:function(a){var b=u[u.length-1];return b?Q(b.logLevel,b).call(this,a):a},log:function(a,b,c){return this.logError(null,a,b,c)},declare:y([],!0,!0,!0),register:y([],!0),execute:y([]),AUI_BUILD_DATE:\"3.18.13-2018-09-26\",\r\n" + 
				"when:ba(),now:ba(!0),trigger:function(a,b,c){var e=I();this.declare(a,{data:b,pageElapsedTime:e-(g.aPageStart||NaN),triggerTime:e});c&&c.instrument&&S.when(\"prv:a-logTrigger\").execute(function(b){b(a)})},handleTriggers:function(){this.log(\"handleTriggers deprecated\")},attributeErrors:function(a){return new E(a)},_namespace:function(a,b){return new E(a,b)}};var n=B(g,\"AmazonUIPageJS\",new E);S=n._namespace(\"PageJS\",\"AmazonUI\");S.declare(\"prv:p-debug\",aa);n.declare(\"p-recorder-events\",[]);n.declare(\"p-recorder-stop\",\r\n" + 
				"function(){});B(g,\"P\",n);ca();if(h.addEventListener){var ha;h.addEventListener(\"DOMContentLoaded\",ha=function(){n.trigger(\"a-domready\");h.removeEventListener(\"DOMContentLoaded\",ha,!1)},!1)}var k=h.documentElement,T=function(){var a=[\"O\",\"ms\",\"Moz\",\"Webkit\"],b=h.createElement(\"div\");return{testGradients:function(){b.style.cssText=\"background-image:-webkit-gradient(linear,left top,right bottom,from(#9f9),to(white));background-image:-webkit-linear-gradient(left top,#9f9,white);background-image:linear-gradient(left top,#9f9,white);\";\r\n" + 
				"return-1<b.style.backgroundImage.indexOf(\"gradient\")},test:function(c){var e=c.charAt(0).toUpperCase()+c.substr(1);c=(a.join(e+\" \")+e+\" \"+c).split(\" \");for(e=c.length;e--;)if(\"\"===b.style[c[e]])return!0;return!1},testTransform3d:function(){var a=!1;g.matchMedia&&(a=g.matchMedia(\"(-webkit-transform-3d)\").matches);return a}}}(),p=k.className,ia=/(^| )a-mobile( |$)/.test(p),ja=/(^| )a-tablet( |$)/.test(p),l={audio:function(){return!!h.createElement(\"audio\").canPlayType},video:function(){return!!h.createElement(\"video\").canPlayType},\r\n" + 
				"canvas:function(){return!!h.createElement(\"canvas\").getContext},svg:function(){return!!h.createElementNS&&!!h.createElementNS(\"http://www.w3.org/2000/svg\",\"svg\").createSVGRect},offline:function(){return navigator.hasOwnProperty&&navigator.hasOwnProperty(\"onLine\")&&navigator.onLine},dragDrop:function(){return\"draggable\"in h.createElement(\"span\")},geolocation:function(){return!!navigator.geolocation},history:function(){return!(!g.history||!g.history.pushState)},webworker:function(){return!!g.Worker},\r\n" + 
				"autofocus:function(){return\"autofocus\"in h.createElement(\"input\")},inputPlaceholder:function(){return\"placeholder\"in h.createElement(\"input\")},textareaPlaceholder:function(){return\"placeholder\"in h.createElement(\"textarea\")},localStorage:function(){return\"localStorage\"in g&&null!==g.localStorage},orientation:function(){return\"orientation\"in g},touch:function(){return\"ontouchend\"in h},gradients:function(){return T.testGradients()},hires:function(){var a=g.devicePixelRatio&&1.5<=g.devicePixelRatio||\r\n" + 
				"g.matchMedia&&g.matchMedia(\"(min-resolution:144dpi)\").matches;v(\"hiRes\"+(ia?\"Mobile\":ja?\"Tablet\":\"Desktop\"),a?1:0);return a},transform3d:function(){return T.testTransform3d()},touchScrolling:function(){return m(/Windowshop|android.([3-9]|[L-Z])|OS ([5-9]|[1-9][0-9]+)(_[0-9]{1,2})+ like Mac OS X|Chrome|Silk|Firefox|Trident.+?; Touch/i)},ios:function(){return m(/OS [1-9][0-9]*(_[0-9]*)+ like Mac OS X/i)&&!m(/trident|Edge/i)},android:function(){return m(/android.([1-9]|[L-Z])/i)&&!m(/trident|Edge/i)},\r\n" + 
				"mobile:function(){return ia},tablet:function(){return ja}},r;for(r in l)l.hasOwnProperty(r)&&(l[r]=ea(l[r]));for(var U=\"textShadow textStroke boxShadow borderRadius borderImage opacity transform transition\".split(\" \"),J=0;J<U.length;J++)l[U[J]]=ea(function(){return T.test(U[J])});var G=!0,fa=0,R={w:0,h:0},H=4;F();w(g,\"resize\",function(){clearTimeout(fa);H=4;F()});var ka={getItem:function(a){try{return g.localStorage.getItem(a)}catch(b){}},setItem:function(a,b){try{return g.localStorage.setItem(a,\r\n" + 
				"b)}catch(c){}}};da(k,\"a-no-js\");A(k,\"a-js\");!m(/OS [1-8](_[0-9]*)+ like Mac OS X/i)||g.navigator.standalone||m(/safari/i)||A(k,\"a-ember\");p=[];for(r in l)l.hasOwnProperty(r)&&l[r]&&p.push(\"a-\"+r.replace(/([A-Z])/g,function(a){return\"-\"+a.toLowerCase()}));A(k,p.join(\" \"));k.setAttribute(\"data-aui-build-date\",\"3.18.13-2018-09-26\");n.register(\"p-detect\",function(){return{capabilities:l,localStorage:l.localStorage&&ka,toggleResponsiveGrid:qa,responsiveGridEnabled:ra}});m(/UCBrowser/i)||l.localStorage&&\r\n" + 
				"A(k,ka.getItem(\"a-font-class\"));n.declare(\"a-event-revised-handling\",!1);n.declare(\"a-fix-event-off\",!1);v(\"pagejs:pkgExecTime\",z()-NaN)})(window,document,Date);\r\n" + 
				"  (window.AmazonUIPageJS ? AmazonUIPageJS : P).load.js('https://images-eu.ssl-images-amazon.com/images/I/611lNbSiw8L._RC|11IYhapguOL.js,61TG4BWqFeL.js,21iSNz47xoL.js,012FVc3131L.js,119KAWlHU6L.js,31KE7boYKEL.js,31yRaEj-EtL.js,51MJgfi30-L.js,11AHlQhPRjL.js,01xMsWWFUQL.js,11aNYFFS5hL.js,116tgw9TSaL.js,21auxuI+dRL.js,01PoLXBDXWL.js,61xD4-MXbLL.js,01mi-J86cyL.js,110HZneHcZL.js,31LzSqSw4xL.js,01rpauTep4L.js,01iyxuSGj4L.js,01-KZRtKiSL.js_.js?AUIClients/AmazonUI#144375-T1');\r\n" + 
				"  (window.AmazonUIPageJS ? AmazonUIPageJS : P).load.js('https://images-eu.ssl-images-amazon.com/images/I/31VHR0Nl1TL._RC|31FCmHjfFsL.js,0137RJuJeSL.js,11Bx6vwDyvL.js,41cyqP2vslL.js,51I5RNRInUL.js,41vsBDiYjvL.js_.js?AUIClients/DesktopSRPMetaAsset#155248-T1.170181-T1');\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<style>.nav-sprite-v1 .nav-sprite, .nav-sprite-v1 .nav-icon {\r\n" + 
				"  background-image: url(https://m.media-amazon.com/images/G/31/gno/sprites/nav-sprite-global_bluebeacon-V3-1x_optimized._CB516557522_.png);\r\n" + 
				"  background-position: 0 1000px;\r\n" + 
				"  background-repeat: repeat-x;\r\n" + 
				"}\r\n" + 
				".nav-spinner {\r\n" + 
				"  background-image: url(https://m.media-amazon.com/images/G/31/javascripts/lib/popover/images/snake._CB138350263_.gif);\r\n" + 
				"  background-position: center center;\r\n" + 
				"  background-repeat: no-repeat;\r\n" + 
				"}\r\n" + 
				".nav-bluebeacon .nav-cobrand {\r\n" + 
				"  background-image: url(https://m.media-amazon.com/images/G/31/gno/images/irctc/IRCTC_Logo-dark-small._CB314487787_.png);\r\n" + 
				"}\r\n" + 
				"</style><!--  -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://images-eu.ssl-images-amazon.com/images/I/712ZhgZXQhL._RC|11qlbytjBCL.css,31+YxuPQ6qL.css,21Wyw4UJQLL.css,31TMzWTidCL.css,11S8GiSgx9L.css,31OvHRW+XiL.css,01XHMOHpK1L.css_.css?AUIClients/NavDesktopMetaAsset#desktop.in\" />\r\n" + 
				"<!-- From remote config v3-->\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"(function(d){document.createElement(\"header\");function b(e){return[].slice.call(e)}function c(f,e){return{m:f,a:b(e)}}var a=function(f){var g={};g._sourceName=f;g._replay=[];g.getNow=function(i,h){return h};function e(i,h,j){i[j]=function(){g._replay.push(h.concat(c(j,arguments)))}}g.when=function(){var i=[c(\"when\",arguments)];var h={};e(h,i,\"run\");e(h,i,\"declare\");e(h,i,\"publish\");e(h,i,\"build\");return h};e(g,[],\"declare\");e(g,[],\"build\");e(g,[],\"publish\");e(g,[],\"importEvent\");a._shims.push(g);return g};a._shims=[];if(!d.$Nav){d.$Nav=a(\"rcx-nav\")}if(!d.$Nav.make){d.$Nav.make=a}}(window));\r\n" + 
				"$Nav.importEvent('navbarJS-beaconbelt');\r\n" + 
				"$Nav.declare('img.sprite', {\r\n" + 
				"  'png8': 'https://m.media-amazon.com/images/G/31/gno/sprites/global-sprite_bluebeacon-v1._CB308130882_.png',\r\n" + 
				"  'png32': 'https://m.media-amazon.com/images/G/31/gno/sprites/nav-sprite-global_bluebeacon-V3-1x_optimized._CB516557522_.png',\r\n" + 
				"  'png32-2x': 'https://m.media-amazon.com/images/G/31/gno/sprites/nav-sprite-global_bluebeacon-V3-2x_optimized._CB516557522_.png'\r\n" + 
				"});\r\n" + 
				"window._navbarSpriteUrl = 'https://m.media-amazon.com/images/G/31/gno/sprites/nav-sprite-global_bluebeacon-V3-1x_optimized._CB516557522_.png';\r\n" + 
				"$Nav.declare('img.pixel', 'https://m.media-amazon.com/images/G/31/x-locale/common/transparent-pixel._CB386942716_.gif');\r\n" + 
				"</script>\r\n" + 
				"<img src=\"https://m.media-amazon.com/images/G/31/gno/sprites/nav-sprite-global_bluebeacon-V3-1x_optimized._CB516557522_.png\" style=\"display:none\" alt=\"\"/>\r\n" + 
				"<!--[if IE 6]>\r\n" + 
				"<style type=\"text/css\"><!--\r\n" + 
				"  #navbar.nav-sprite-v3 .nav-sprite {\r\n" + 
				"    background-image: url(https://m.media-amazon.com/images/G/31/gno/sprites/global-sprite_bluebeacon-v1._CB308130882_.png);\r\n" + 
				"  }\r\n" + 
				"--></style>\r\n" + 
				"<![endif]-->\r\n" + 
				"<!--  -->\r\n" + 
				"<script>\r\n" + 
				"(window.AmazonUIPageJS ? AmazonUIPageJS : P).when('navCF').execute(function(){\r\n" + 
				"  (window.AmazonUIPageJS ? AmazonUIPageJS : P).load.js('https://images-eu.ssl-images-amazon.com/images/I/71iULtPe2nL._RC|61L2dvOyb4L.js,41auSr815yL.js,01PngnMp3uL.js,01wBjiz9OvL.js,216el1NpxhL.js,31SYqzmbU3L.js,51+klsvwgqL.js,31kByMCr23L.js_.js?AUIClients/NavDesktopMetaAsset#desktop');\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>\r\n" + 
				"window.ue_ihe = (window.ue_ihe || 0) + 1;\r\n" + 
				"if (window.ue_ihe === 1) {\r\n" + 
				"(function(e,c){function h(b,a){f.push([b,a])}function g(b,a){if(b){var c=e.head||e.getElementsByTagName(\"head\")[0]||e.documentElement,d=e.createElement(\"script\");d.async=\"async\";d.src=b;d.setAttribute(\"crossorigin\",\"anonymous\");a&&a.onerror&&(d.onerror=a.onerror);a&&a.onload&&(d.onload=a.onload);c.insertBefore(d,c.firstChild)}}function k(){ue.uels=g;for(var b=0;b<f.length;b++){var a=f[b];g(a[0],a[1])}ue.deffered=1}var f=[];c.ue&&(ue.uels=h,c.ue.attach&&c.ue.attach(\"load\",k))})(document,window);\r\n" + 
				"(function(k,l,g){function m(a){c||(c=b[a.type].id,\"undefined\"===typeof a.clientX?(e=a.pageX,f=a.pageY):(e=a.clientX,f=a.clientY),2!=c||h&&(h!=e||n!=f)?(r(),d.isl&&l.setTimeout(function(){p(\"at\",d.id)},0)):(h=e,n=f,c=0))}function r(){for(var a in b)b.hasOwnProperty(a)&&d.detach(a,m,b[a].parent)}function s(){for(var a in b)b.hasOwnProperty(a)&&d.attach(a,m,b[a].parent)}function t(){var a=\"\";!q&&c&&(q=1,a+=\"&ui=\"+c);return a}var d=k.ue,p=k.uex,q=0,c=0,h,n,e,f,b={click:{id:1,parent:g},mousemove:{id:2,\r\n" + 
				"parent:g},scroll:{id:3,parent:l},keydown:{id:4,parent:g}};d&&p&&(s(),d._ui=t)})(ue_csm,window,document);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    if (window.ue && window.ue.uels) {\r\n" + 
				"            var cel_widgets = [ { \"c\":\"celwidget\" } ];\r\n" + 
				"\r\n" + 
				"                ue.uels(\"https://images-eu.ssl-images-amazon.com/images/G/01/AUIClients/ClientSideMetricsAUIJavascript@jserrorsForester.0acd236281a4d93774c265b3bec043f2087a43c2._V2_.js\");\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"(function(k,c){function l(a,b){return a.filter(function(a){return a.initiatorType==b})}function f(a,c){if(b.t[a]){var g=b.t[a]-b._t0,e=c.filter(function(a){return 0!==a.responseEnd&&m(a)<g}),f=l(e,\"script\"),h=l(e,\"link\"),k=l(e,\"img\"),n=e.map(function(a){return a.name.split(\"/\")[2]}).filter(function(a,b,c){return a&&c.lastIndexOf(a)==b}),q=e.filter(function(a){return a.duration<p}),s=g-Math.max.apply(null,e.map(m))<r|0;\"af\"==a&&(b._afjs=f.length);return a+\":\"+[e[d],f[d],h[d],k[d],n[d],q[d],s].join(\"-\")}}\r\n" + 
				"function m(a){return a.responseEnd-(b._t0-c.timing.navigationStart)}function n(){var a=c[h](\"resource\"),d=f(\"cf\",a),g=f(\"af\",a),a=f(\"ld\",a);delete b._rt;b._ld=b.t.ld-b._t0;b._art&&b._art();return[d,g,a].join(\"_\")}var p=20,r=50,d=\"length\",b=k.ue,h=\"getEntriesByType\";b._rre=m;b._rt=c&&c.timing&&c[h]&&n})(ue_csm,window.performance);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"(function(s,f){function m(b,e,c){var a=l;f.ue_cmi&&(a=t);c=c||new Date(+new Date+a);c=\"expires=\"+c.toUTCString();n.cookie=b+\"=\"+e+\";\"+c+\";path=/\"}function p(b){b+=\"=\";for(var e=n.cookie.split(\";\"),c=0;c<e.length;c++){for(var a=e[c];\" \"==a.charAt(0);)a=a.substring(1);if(0===a.indexOf(b))return decodeURIComponent(a.substring(b.length,a.length))}return\"\"}function q(b,e,c){if(!e)return b;-1<b.indexOf(\"{\")&&(b=\"\");for(var a=b.split(\"&\"),g,d=!1,f=!1,h=0;h<a.length;h++)g=a[h].split(\":\"),g[0]==e?(!c||d?a.splice(h,\r\n" + 
				"1):(g[1]=c,a[h]=g.join(\":\")),f=d=!0):2>g.length&&(a.splice(h,1),f=!0);f&&(b=a.join(\"&\"));!d&&c&&(0<b.length&&(b+=\"&\"),b+=e+\":\"+c);return b}var k=s.ue||{},l=6048E5,t=100*l,n=ue_csm.document||f.document,r=null,d;a:{try{d=f.localStorage;break a}catch(u){}d=void 0}k.count&&k.count(\"csm.cookieSize\",document.cookie.length);k.cookie={get:p,set:m,updateCsmHit:function(b,e,c){try{var a;if(!(a=r)){var g;a:{try{if(d&&d.getItem){g=d.getItem(\"csm-hit\");break a}}catch(k){}g=void 0}a=g||p(\"csm-hit\")||\"{}\"}a=q(a,\r\n" + 
				"b,e);f.ue_cmi&&(a=q(a,\"t\",+new Date));r=a;try{d&&d.setItem&&d.setItem(\"csm-hit\",a)}catch(l){}m(\"csm-hit\",a,c)}catch(h){\"function\"==typeof f.ueLogError&&ueLogError(Error(\"Cookie manager: \"+h.message),{logLevel:\"WARN\"})}}}})(ue_csm,window);\r\n" + 
				"\r\n" + 
				"(function(m,d){function c(b){b=\"\";var c=a.isBFT?\"b\":\"s\",d=\"\"+a.oid,f=\"\"+a.lid,g=d;d!=f&&20==f.length&&(c+=\"a\",g+=\"-\"+f);a.tabid&&(b=a.tabid+\"+\");b+=c+\"-\"+g;b!=e&&100>b.length&&(e=b,a.cookie?a.cookie.updateCsmHit(n,b+(\"|\"+ +new Date),h):document.cookie=\"csm-hit=\"+b+(\"|\"+ +new Date)+p+\"; path=/\")}function q(){e=0}function k(b){!0===d[a.pageViz.propHid]?e=0:!1===d[a.pageViz.propHid]&&c({type:\"visible\"})}var h=new Date(+new Date+6048E5),p=\"; expires=\"+h.toGMTString(),n=\"tb\",e,a=m.ue||{},l=a.pageViz&&\r\n" + 
				"a.pageViz.event&&a.pageViz.propHid;a.attach&&(a.attach(\"click\",c),a.attach(\"keyup\",c),l||(a.attach(\"focus\",c),a.attach(\"blur\",q)),l&&(a.attach(a.pageViz.event,k,d),k({})));a.aftb=1})(ue_csm,document);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ue_csm.ue.stub(ue,\"impression\");\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"(function(k,d,h){function f(a,c,b){a&&a.indexOf&&0===a.indexOf(\"http\")&&0!==a.indexOf(\"https\")&&l(s,c,a,b)}function g(a,c,b){a&&a.indexOf&&(location.href.split(\"#\")[0]!=a&&null!==a&&\"undefined\"!==typeof a||l(t,c,a,b))}function l(a,c,b,e){m[b]||(e=u&&e?n(e):\"N/A\",d.ueLogError&&d.ueLogError({message:a+c+\" : \"+b,logLevel:v,stack:\"N/A\"},{attribution:e}),m[b]=1,p++)}function e(a,c){if(a&&c)for(var b=0;b<a.length;b++)try{c(a[b])}catch(d){}}function q(){return d.performance&&d.performance.getEntriesByType?\r\n" + 
				"d.performance.getEntriesByType(\"resource\"):[]}function n(a){if(a.id)return\"//*[@id='\"+a.id+\"']\";var c;c=1;var b;for(b=a.previousSibling;b;b=b.previousSibling)b.nodeName==a.nodeName&&(c+=1);b=a.nodeName;1!=c&&(b+=\"[\"+c+\"]\");a.parentNode&&(b=n(a.parentNode)+\"/\"+b);return b}function w(){var a=h.images;a&&a.length&&e(a,function(a){var b=a.getAttribute(\"src\");f(b,\"img\",a);g(b,\"img\",a)})}function x(){var a=h.scripts;a&&a.length&&e(a,function(a){var b=a.getAttribute(\"src\");f(b,\"script\",a);g(b,\"script\",a)})}\r\n" + 
				"function y(){var a=h.styleSheets;a&&a.length&&e(a,function(a){if(a=a.ownerNode){var b=a.getAttribute(\"href\");f(b,\"style\",a);g(b,\"style\",a)}})}function z(){if(A){var a=q();e(a,function(a){f(a.name,a.initiatorType)})}}function B(){e(q(),function(a){g(a.name,a.initiatorType)})}function r(){var a;a=d.location&&d.location.protocol?d.location.protocol:void 0;\"https:\"==a&&(z(),w(),x(),y(),B(),p<C&&setTimeout(r,D))}var s=\"[CSM] Insecure content detected \",t=\"[CSM] Ajax request to same page detected \",v=\"WARN\",\r\n" + 
				"m={},p=0,D=k.ue_nsip||1E3,C=5,A=1==k.ue_urt,u=!0;ue_csm.ue_disableNonSecure||(d.performance&&d.performance.setResourceTimingBufferSize&&d.performance.setResourceTimingBufferSize(300),r())})(ue_csm,window,document);\r\n" + 
				"\r\n" + 
				"(function(d){d.ue_cel_stub||(d.ue_cel_stub=function(){var b={};return{registerModule:function(a,c){b[a]||(b[a]=c,b[a].on())},replayModule:function(a,c){b[a]&&(b[a].replay(c),b[a].off(),delete b[a])}}}())})(ue_csm);\r\n" + 
				"(function(a,d,h){a.ue_mcm_stub||a.ue&&a.ue.isBF||(a.ue_mcm_stub=function(){function e(a){var b=c.d(),e=(d.body||{}).scrollWidth,k=(d.body||{}).scrollHeight,f;h&&\"function\"===typeof h.now&&a.timeStamp&&(f=h.now()-a.timeStamp,f=parseFloat(f.toFixed(2)));g.push({rawEvent:a,additionalData:{ots:b,ow:e,oh:k,odt:f}})}var c=a.ue,g=[];return{on:function(){c.attach&&c.attach(\"click\",e,d)},off:function(){c.detach&&c.detach(\"click\",e,d)},replay:function(a){for(var b=0;b<g.length;b++)a(g[b].rawEvent,g[b].additionalData)}}}(),\r\n" + 
				"a.ue_cel_stub&&a.ue_cel_stub.registerModule(\"mcm\",a.ue_mcm_stub))})(ue_csm,document,window.performance);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"if(window.ue&&uet) { uet('bb'); }\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"</script></head><body class=\"a-aui_149818-c a-aui_152852-c a-aui_157141-c a-aui_158613-c a-aui_160684-c a-aui_57326-c a-aui_72554-c a-aui_accessibility_49860-c a-aui_attr_validations_1_51371-c a-aui_bolt_62845-c a-aui_perf_130093-c a-aui_tnr_140932-c a-aui_ux_113788-c a-aui_ux_114039-c a-aui_ux_138741-c a-aui_ux_145937-c a-aui_ux_60000-c\"><div id=\"a-page\"><script type=\"a-state\" data-a-state=\"{&quot;key&quot;:&quot;a-wlab-states&quot;}\">{\"AUI_160684\":\"C\",\"AUI_157141\":\"C\",\"AUI_UX_114039\":\"C\",\"AUI_UX_113788\":\"C\",\"AUI_UX_145937\":\"C\",\"AUI_57326\":\"C\",\"AUI_158613\":\"C\",\"AUI_149818\":\"C\",\"AUI_72554\":\"C\",\"AUI_BOLT_62845\":\"C\",\"AUI_TNR_140932\":\"C\",\"AUI_UX_60000\":\"C\",\"AUI_ATTR_VALIDATIONS_1_51371\":\"C\",\"AUI_ACCESSIBILITY_49860\":\"C\",\"AUI_152852\":\"C\",\"AUI_PERF_130093\":\"C\",\"AUI_UX_138741\":\"C\"}</script>\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>\r\n" + 
				"\r\n" + 
				"(function(){function l(a){for(var c=b.location.search.substring(1).split(\"&\"),e=0;e<c.length;e++){var d=c[e].split(\"=\");if(d[0]===a)return d[1]}}window.amzn=window.amzn||{};amzn.copilot=amzn.copilot||{};var b=window,f=document,g=b.P||b.AmazonUIPageJS,h=f.head||f.getElementsByTagName(\"head\")[0],m=0,n=0;amzn.copilot.checkCoPilotSession=function(){f.cookie.match(\"cpidv\")&&(\"undefined\"!==typeof jQuery&&k(jQuery),g&&g.when&&g.when(\"jQuery\").execute(function(a){k(a)}),b.amznJQ&&b.amznJQ.available&&b.amznJQ.available(\"jQuery\",\r\n" + 
				"function(){k(jQuery)}),b.jQuery||g||b.amznJQ||q())};var q=function(){m?b.ue&&\"function\"===typeof b.ue.count&&b.ue.count(\"cpJQUnavailable\",1):(m=1,f.addEventListener?f.addEventListener(\"DOMContentLoaded\",amzn.copilot.checkCoPilotSession,!1):f.attachEvent&&f.attachEvent(\"onreadystatechange\",function(){\"complete\"===f.readyState&&amzn.copilot.checkCoPilotSession()}))},k=function(a){if(!n){n=1;amzn.copilot.jQuery=a;a=l(\"debugJS\");var c=\"https:\"===b.location.protocol?1:0,e=1;url=\"/gp/copilot/handlers/copilot_strings_resources.html\";\r\n" + 
				"window.texas&&texas.locations&&(url=texas.locations.makeUrl(url));g&&g.AUI_BUILD_DATE&&(e=0);amzn.copilot.jQuery.ajax&&amzn.copilot.jQuery.ajax({url:url,dataType:\"json\",data:{isDebug:a,isSecure:c,includeAUIP:e},success:function(a){amzn.copilot.vip=a.serviceEndPoint;amzn.copilot.enableMultipleTabSession=a.isFollowMe;r(a)},error:function(){b.ue.count(\"cpLoadResourceError\",1)}})}},r=function(a){var c=amzn.copilot.jQuery,e=function(){amzn.copilot.setup(c.extend({isContinuedSession:!0},a))};a.CSSUrls&&\r\n" + 
				"c.each(a.CSSUrls[0],function(a,c){var b=f.createElement(\"link\");b.type=\"text/css\";b.rel=\"stylesheet\";b.href=c;h.appendChild(b)});a.CSSTag&&s(a.CSSTag);if(a.JSUrls){var d=l(\"forceSynchronousJS\"),b=a.JSUrls[0];c.each(b,function(a,c){a===b.length-1?p(c,d,e):p(c,d)})}a.JSTag&&(t(a.JSTag),P.when(\"CSCoPilotPresenterAsset\").execute(function(){e()}))},t=function(a){var c=f.createElement(\"div\");c.innerHTML=a;a=0;for(var b=c.children.length;a<b;a++){var d=f.createElement(\"script\");d.type=\"text/javascript\";\r\n" + 
				"d.innerHTML=c.children[a].innerHTML;h.appendChild(d)}},s=function(a){var b=f.createElement(\"div\");b.innerHTML=a;a=0;for(var e=b.children.length;a<e;a++)h.appendChild(b.children[a])},p=function(a,b,e){var d=f.createElement(\"script\");d.type=\"text/javascript\";d.src=a;d.async=b?!1:!0;e&&(d.onload=e);h.appendChild(d)}})();\r\n" + 
				"\r\n" + 
				"amzn.copilot.checkCoPilotSession();\r\n" + 
				"\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!-- NAVYAAN -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!--Pilu -->\r\n" + 
				"\r\n" + 
				"<!-- navmet initial definition -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>\r\n" + 
				"    if(window.navmet===undefined) {\r\n" + 
				"      window.navmet=[];\r\n" + 
				"      if (window.performance && window.performance.timing && window.ue_t0) {\r\n" + 
				"        var t = window.performance.timing;\r\n" + 
				"        var now = + new Date();\r\n" + 
				"        window.navmet.basic = {\r\n" + 
				"          'networkLatency': (t.responseStart - t.fetchStart),\r\n" + 
				"          'navFirstPaint': (now - t.responseStart),\r\n" + 
				"          'NavStart': (now - window.ue_t0)\r\n" + 
				"        };\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"  <script type='text/javascript'>\r\n" + 
				"    window.uet && uet('ns');\r\n" + 
				"    window._navbar = (function (o) {\r\n" + 
				"      o.componentLoaded = o.loading = function(){};\r\n" + 
				"      o.browsepromos = {};\r\n" + 
				"      o.issPromos = [];\r\n" + 
				"      return o;\r\n" + 
				"    }(window._navbar || {}));\r\n" + 
				"    window._navbar.declareOnLoad = function () { window.$Nav && $Nav.declare('page.load'); };\r\n" + 
				"    if (window.addEventListener) {\r\n" + 
				"      window.addEventListener(\"load\", window._navbar.declareOnLoad, false);\r\n" + 
				"    } else if (window.attachEvent) {\r\n" + 
				"      window.attachEvent(\"onload\", window._navbar.declareOnLoad);\r\n" + 
				"    } else if (window.$Nav) {\r\n" + 
				"      $Nav.when('page.domReady').run(\"OnloadFallbackSetup\", function () {\r\n" + 
				"        window._navbar.declareOnLoad();\r\n" + 
				"      });\r\n" + 
				"    }\r\n" + 
				"    window.$Nav && $Nav.declare('logEvent.enabled',\r\n" + 
				"      'false');\r\n" + 
				"\r\n" + 
				"    window.$Nav && $Nav.declare('config.lightningDeals', {\"activeItems\":[],\"marketplaceID\":\"A21TJRUUN4KGV\",\"customerID\":\"AXIICQMQ0IE6Y\"});\r\n" + 
				"  </script>\r\n" + 
				"\r\n" + 
				"    <style mark=\"aboveNavInjectionCSS\" type=\"text/css\">\r\n" + 
				"      .nav-bluebeacon .nav-cobrand{background-image: url(https://images-eu.ssl-images-amazon.com/images/G/31/gno/images/irctc/IRCTC_Logo-dark-small.png);}\r\n" + 
				"    </style>\r\n" + 
				"    <script mark=\"aboveNavInjectionJS\" type=\"text/javascript\">\r\n" + 
				"      try {\r\n" + 
				"        window.$Nav && $Nav.when('$').run('defineIsArray', function(jQuery) { if(jQuery.isArray===undefined) { jQuery.isArray=function(param) { if(param.length===undefined) { return false; } return true; }; } }); window.$Nav && $Nav.when('$','$F','config','logEvent','panels','phoneHome','dataPanel','flyouts.renderPromo','flyouts.sloppyTrigger','flyouts.accessibility','util.mouseOut','util.onKey','debug.param').build('flyouts.buildSubPanels',function($,$F,config,logEvent,panels,phoneHome,dataPanel,renderPromo,createSloppyTrigger,a11yHandler,mouseOutUtility,onKey,debugParam){var flyoutDebug=debugParam('navFlyoutClick');return function(flyout,event){var linkKeys=[];$('.nav-item',flyout.elem()).each(function(){var $item=$(this);linkKeys.push({link:$item,panelKey:$item.attr('data-nav-panelkey')});});if(linkKeys.length===0){return;} var visible=false;var $parent=$('<div class=\\'nav-subcats\\'></div>').appendTo(flyout.elem());var panelGroup=flyout.getName()+'SubCats';var hideTimeout=null;var sloppyTrigger=createSloppyTrigger($parent);var showParent=function(){if(hideTimeout){clearTimeout(hideTimeout);hideTimeout=null;} if(visible){return;} var height=$('#nav-flyout-shopAll').height();$parent.css({'height': height});$parent.animate({width:'show'},{duration:200,complete:function(){$parent.css({overflow:'visible'});}});visible=true;};var hideParentNow=function(){$parent.stop().css({overflow:'hidden',display:'none',width:'auto',height:'auto'});panels.hideAll({group:panelGroup});visible=false;if(hideTimeout){clearTimeout(hideTimeout);hideTimeout=null;}};var hideParent=function(){if(!visible){return;} if(hideTimeout){clearTimeout(hideTimeout);hideTimeout=null;} hideTimeout=setTimeout(hideParentNow,10);};flyout.onHide(function(){sloppyTrigger.disable();hideParentNow();this.elem().hide();});var addPanel=function($link,panelKey){var panel=dataPanel({className:'nav-subcat',dataKey:panelKey,groups:[panelGroup],spinner:false,visible:false});if(!flyoutDebug){var mouseout=mouseOutUtility();mouseout.add(flyout.elem());mouseout.action(function(){panel.hide();});mouseout.enable();} var a11y=a11yHandler({link:$link,onEscape:function(){panel.hide();$link.focus();}});var logPanelInteraction=function(promoID,wlTriggers){var logNow=$F.once().on(function(){var panelEvent=$.extend({},event,{id:promoID});if(config.browsePromos&&!!config.browsePromos[promoID]){panelEvent.bp=1;} logEvent(panelEvent);phoneHome.trigger(wlTriggers);});if(panel.isVisible()&&panel.hasInteracted()){logNow();}else{panel.onInteract(logNow);}};panel.onData(function(data){renderPromo(data.promoID,panel.elem());logPanelInteraction(data.promoID,data.wlTriggers);});panel.onShow(function(){var columnCount=$('.nav-column',panel.elem()).length;panel.elem().addClass('nav-colcount-'+columnCount);showParent();var $subCatLinks=$('.nav-subcat-links > a',panel.elem());var length=$subCatLinks.length;if(length>0){var firstElementLeftPos=$subCatLinks.eq(0).offset().left;for(var i=1;i<length;i++){if(firstElementLeftPos===$subCatLinks.eq(i).offset().left){$subCatLinks.eq(i).addClass('nav_linestart');}} if($('span.nav-title.nav-item',panel.elem()).length===0){var catTitle=$.trim($link.html());catTitle=catTitle.replace(/ref=sa_menu_top/g,'ref=sa_menu');var $subPanelTitle=$('<span class=\\'nav-title nav-item\\'>'+ catTitle+'</span>');panel.elem().prepend($subPanelTitle);}} $link.addClass('nav-active');});panel.onHide(function(){$link.removeClass('nav-active');hideParent();a11y.disable();sloppyTrigger.disable();});panel.onShow(function(){a11y.elems($('a, area',panel.elem()));});sloppyTrigger.register($link,panel);if(flyoutDebug){$link.click(function(){if(panel.isVisible()){panel.hide();}else{panel.show();}});} var panelKeyHandler=onKey($link,function(){if(this.isEnter()||this.isSpace()){panel.show();}},'keydown',false);$link.focus(function(){panelKeyHandler.bind();}).blur(function(){panelKeyHandler.unbind();});panel.elem().appendTo($parent);};var hideParentAndResetTrigger=function(){hideParent();sloppyTrigger.disable();};for(var i=0;i<linkKeys.length;i++){var item=linkKeys[i];if(item.panelKey){addPanel(item.link,item.panelKey);}else{item.link.mouseover(hideParentAndResetTrigger);}}};});\r\n" + 
				"      } catch ( err ) {\r\n" + 
				"        if ( window.$Nav ) {\r\n" + 
				"          window.$Nav.when('metrics', 'logUeError').run(function(metrics, log) {\r\n" + 
				"            metrics.increment('NavJS:AboveNavInjection:error');\r\n" + 
				"            log(err.toString(), {\r\n" + 
				"              'attribution': 'rcx-nav',\r\n" + 
				"              'logLevel': 'FATAL'\r\n" + 
				"            });\r\n" + 
				"          });\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    </script>\r\n" + 
				"\r\n" + 
				"  <noscript>\r\n" + 
				"    <style type=\"text/css\"><!--\r\n" + 
				"      #navbar #nav-shop .nav-a:hover {\r\n" + 
				"        color: #ff9900;\r\n" + 
				"        text-decoration: underline;\r\n" + 
				"      }\r\n" + 
				"      #navbar #nav-search .nav-search-facade,\r\n" + 
				"      #navbar #nav-tools .nav-icon,\r\n" + 
				"      #navbar #nav-shop .nav-icon,\r\n" + 
				"      #navbar #nav-subnav .nav-hasArrow .nav-arrow {\r\n" + 
				"        display: none;\r\n" + 
				"      }\r\n" + 
				"      #navbar #nav-search .nav-search-submit,\r\n" + 
				"      #navbar #nav-search .nav-search-scope {\r\n" + 
				"        display: block;\r\n" + 
				"      }\r\n" + 
				"      #nav-search .nav-search-scope {\r\n" + 
				"        padding: 0 5px;\r\n" + 
				"      }\r\n" + 
				"      #navbar #nav-search .nav-search-dropdown {\r\n" + 
				"        position: relative;\r\n" + 
				"        top: 5px;\r\n" + 
				"        height: 23px;\r\n" + 
				"        font-size: 14px;\r\n" + 
				"        opacity: 1;\r\n" + 
				"        filter: alpha(opacity = 100);\r\n" + 
				"      }\r\n" + 
				"    --></style>\r\n" + 
				" </noscript>\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'PreNav',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"\r\n" + 
				"<a id='nav-top'></a>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"\r\n" + 
				"  <div id='nav-upnav' aria-hidden='true'  >\r\n" + 
				"    <!-- unw1 failed -->\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'UpNav',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>window.navmet.main=+new Date();</script>\r\n" + 
				"\r\n" + 
				"<header class = \"nav-opt-sprite nav-locale-in nav-lang-en nav-ssl nav-rec\">\r\n" + 
				"  <div id='navbar' cel_widget_id='Navigation-desktop-navbar' role='navigation' class='nav-sprite-v1 celwidget nav-bluebeacon nav-packard-glow'>\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    <div id='nav-belt'>\r\n" + 
				"      \r\n" + 
				"      \r\n" + 
				"      \r\n" + 
				"      <div class='nav-left'>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        <script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"  <div id=\"nav-logo\" >\r\n" + 
				"    <a href=\"/ref=nav_logo\" class=\"nav-logo-link\" tabindex=\"6\">\r\n" + 
				"      <span class=\"nav-sprite nav-logo-base\">Amazon</span>\r\n" + 
				"      <span class=\"nav-sprite nav-logo-ext\"></span>\r\n" + 
				"      <span class=\"nav-sprite nav-logo-locale\"></span>\r\n" + 
				"    </a>\r\n" + 
				"  <a href=\"/prime?ref=nav_logo_prime_join\" aria-label=\"\" class=\"nav-sprite nav-logo-tagline nav-prime-try\" tabindex=\"7\">\r\n" + 
				"    Try Prime\r\n" + 
				"  </a>\r\n" + 
				"  </div>\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'Logo',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"      </div>\r\n" + 
				"      <div class='nav-right'>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        <script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"\r\n" + 
				"  <div id='nav-swmslot'>\r\n" + 
				"    <div id=\"navSwmHoliday\" style=\"background-image: url(https://images-eu.ssl-images-amazon.com/images/G/31/img16/app/Jupiter-18/Jackpot/Gateway/1137131_400x39_3._CB483943426_.jpg); width: 400px; height: 39px; overflow: hidden;position: relative;\"><img alt='Amazon App Contest' src='https://images-eu.ssl-images-amazon.com/images/G/31/x-locale/common/transparent-pixel._CB386942716_.gif' border='0' width='400px' height='39px' usemap='#nav-swm-holiday-map' /></div><div style=\"display: none;\"><map id=\"nav-swm-holiday-map\" name=\"nav-swm-holiday-map\"><area shape=\"rect\" coords=\"1,2,400,39\" href =\"http://www.amazon.in/b/ref=nav_swm_swm_sweeps?_encoding=UTF8&node=6967394031&pf_rd_p=b2c2e560-980f-441e-bf98-723da85a3378&pf_rd_s=nav-sitewide-msg&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_r=53RX2GATRXV3PYFHQG9N&pf_rd_r=53RX2GATRXV3PYFHQG9N&pf_rd_p=b2c2e560-980f-441e-bf98-723da85a3378\" alt =\"Amazon App Contest\" /></map></div>\r\n" + 
				"  </div>\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'SWM',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"      </div>\r\n" + 
				"      <div class='nav-fill'>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        <script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"<div id=\"nav-search\">\r\n" + 
				"  <div id=\"nav-bar-left\"></div>\r\n" + 
				"  <form\r\n" + 
				"    accept-charset=\"utf-8\"\r\n" + 
				"    action=\"/s/ref=nb_sb_noss\"\r\n" + 
				"    class=\"nav-searchbar\"\r\n" + 
				"    method=\"GET\"\r\n" + 
				"    name=\"site-search\"\r\n" + 
				"    role=\"search\"\r\n" + 
				"  >\r\n" + 
				"    <div class=\"nav-left\">\r\n" + 
				"      <div id=\"nav-search-dropdown-card\">\r\n" + 
				"        \r\n" + 
				"  <div class=\"nav-search-scope nav-sprite\">\r\n" + 
				"    <div class=\"nav-search-facade\" data-value=\"search-alias=aps\">\r\n" + 
				"      <span class=\"nav-search-label\">All</span>\r\n" + 
				"      <i class=\"nav-icon\"></i>\r\n" + 
				"    </div>\r\n" + 
				"    <span id=\"searchDropdownDescription\" style=\"display:none\">Select the department you want to search in</span>\r\n" + 
				"    <select\r\n" + 
				"      aria-describedby=\"searchDropdownDescription\"\r\n" + 
				"      class=\"nav-search-dropdown searchSelect\"\r\n" + 
				"      data-nav-digest=\"ttsMuIh/45iCaYgWKM7Mi1I3UOw=\"\r\n" + 
				"      data-nav-selected=\"0\"\r\n" + 
				"      id=\"searchDropdownBox\"\r\n" + 
				"      name=\"url\"\r\n" + 
				"      style=\"display: block;\"\r\n" + 
				"      tabindex=\"8\"\r\n" + 
				"      title=\"Search in\"\r\n" + 
				"    >\r\n" + 
				"        <option selected=\"selected\" value=\"search-alias=aps\">All Categories</option>\r\n" + 
				"        <option value=\"search-alias=alexa-skills\">Alexa Skills</option>\r\n" + 
				"        <option value=\"search-alias=amazon-devices\">Amazon Devices</option>\r\n" + 
				"        <option value=\"search-alias=fashion\">Amazon Fashion</option>\r\n" + 
				"        <option value=\"search-alias=amazon-global-store\">Amazon Global Store</option>\r\n" + 
				"        <option value=\"search-alias=pantry\">Amazon Pantry</option>\r\n" + 
				"        <option value=\"search-alias=appliances\">Appliances</option>\r\n" + 
				"        <option value=\"search-alias=mobile-apps\">Apps & Games</option>\r\n" + 
				"        <option value=\"search-alias=baby\">Baby</option>\r\n" + 
				"        <option value=\"search-alias=beauty\">Beauty</option>\r\n" + 
				"        <option value=\"search-alias=stripbooks\">Books</option>\r\n" + 
				"        <option value=\"search-alias=automotive\">Car & Motorbike</option>\r\n" + 
				"        <option value=\"search-alias=apparel\">Clothing & Accessories</option>\r\n" + 
				"        <option value=\"search-alias=collectibles\">Collectibles</option>\r\n" + 
				"        <option value=\"search-alias=computers\">Computers & Accessories</option>\r\n" + 
				"        <option value=\"search-alias=electronics\">Electronics</option>\r\n" + 
				"        <option value=\"search-alias=furniture\">Furniture</option>\r\n" + 
				"        <option value=\"search-alias=lawngarden\">Garden & Outdoors</option>\r\n" + 
				"        <option value=\"search-alias=gift-cards\">Gift Cards</option>\r\n" + 
				"        <option value=\"search-alias=grocery\">Grocery & Gourmet Foods</option>\r\n" + 
				"        <option value=\"search-alias=hpc\">Health & Personal Care</option>\r\n" + 
				"        <option value=\"search-alias=kitchen\">Home & Kitchen</option>\r\n" + 
				"        <option value=\"search-alias=industrial\">Industrial & Scientific</option>\r\n" + 
				"        <option value=\"search-alias=jewelry\">Jewellery</option>\r\n" + 
				"        <option value=\"search-alias=digital-text\">Kindle Store</option>\r\n" + 
				"        <option value=\"search-alias=luggage\">Luggage & Bags</option>\r\n" + 
				"        <option value=\"search-alias=luxury-beauty\">Luxury Beauty</option>\r\n" + 
				"        <option value=\"search-alias=dvd\">Movies & TV Shows</option>\r\n" + 
				"        <option value=\"search-alias=popular\">Music</option>\r\n" + 
				"        <option value=\"search-alias=mi\">Musical Instruments</option>\r\n" + 
				"        <option value=\"search-alias=office-products\">Office Products</option>\r\n" + 
				"        <option value=\"search-alias=pets\">Pet Supplies</option>\r\n" + 
				"        <option value=\"search-alias=shoes\">Shoes & Handbags</option>\r\n" + 
				"        <option value=\"search-alias=software\">Software</option>\r\n" + 
				"        <option value=\"search-alias=sporting\">Sports, Fitness & Outdoors</option>\r\n" + 
				"        <option value=\"search-alias=home-improvement\">Tools & Home Improvement</option>\r\n" + 
				"        <option value=\"search-alias=toys\">Toys & Games</option>\r\n" + 
				"        <option value=\"search-alias=videogames\">Video Games</option>\r\n" + 
				"        <option value=\"search-alias=watches\">Watches</option>\r\n" + 
				"    </select>\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"nav-right\">\r\n" + 
				"      <div class=\"nav-search-submit nav-sprite\">\r\n" + 
				"        <span id=\"nav-search-submit-text\" class=\"nav-search-submit-text nav-sprite\">\r\n" + 
				"          Go\r\n" + 
				"        </span>\r\n" + 
				"        <input type=\"submit\" class=\"nav-input\" value=\"Go\" tabindex=\"10\">\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"nav-fill\">\r\n" + 
				"      <div class=\"nav-search-field \">\r\n" + 
				"        <!-- DO NOT REMOVE: the text in the label are for screen reader, and it is not visible in the web page -->\r\n" + 
				"        <label id=\"nav-search-label\" for=\"twotabsearchtextbox\" class=\"aok-offscreen\">\r\n" + 
				"          Search\r\n" + 
				"        </label>\r\n" + 
				"        <input\r\n" + 
				"          type=\"text\"\r\n" + 
				"          id=\"twotabsearchtextbox\"\r\n" + 
				"          value=\"\"\r\n" + 
				"          name=\"field-keywords\"\r\n" + 
				"          autocomplete=\"off\"\r\n" + 
				"          placeholder=\"\"\r\n" + 
				"          class=\"nav-input\"\r\n" + 
				"          dir=\"auto\"\r\n" + 
				"          tabindex=\"9\"\r\n" + 
				"        >\r\n" + 
				"      </div>\r\n" + 
				"      <div id=\"nav-iss-attach\"></div>\r\n" + 
				"    </div>\r\n" + 
				"  </form>\r\n" + 
				"</div>\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'Search',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div id='nav-main' class='nav-sprite'>\r\n" + 
				"      \r\n" + 
				"      \r\n" + 
				"      \r\n" + 
				"      \r\n" + 
				"      \r\n" + 
				"      <div class='nav-left'>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        <div id='nav-global-location-slot'><span class='a-declarative' data-a-modal='{&quot;width&quot;:375,&quot;closeButton&quot;:&quot;false&quot;,&quot;popoverLabel&quot;:&quot;Choose your location&quot;,&quot;name&quot;:&quot;glow-modal&quot;,&quot;url&quot;:&quot;/gp/glow/get-address-selections.html?selectedLocationType=ADDRESS_ID&amp;selectedLocationValue=PYOPTOEANYF5P2TIVD74G136EI0QMQCIIXAXIICQMQ0IE6YPXTQ2EIA2OXSRXYR7&amp;deviceType=desktop&amp;pageType=CustomerReviews&amp;storeContext=CustomerReviewsHorizonteApp&quot;,&quot;footer&quot;:&quot;&lt;span class=\\&quot;a-declarative\\&quot; data-action=\\&quot;a-popover-close\\&quot; data-a-popover-close=\\&quot;{}\\&quot;&gt;&lt;span class=\\&quot;a-button a-button-primary\\&quot;&gt;&lt;span class=\\&quot;a-button-inner\\&quot;&gt;&lt;button name=\\&quot;glowDoneButton\\&quot; class=\\&quot;a-button-text\\&quot; type=\\&quot;button\\&quot;&gt;Done&lt;/button&gt;&lt;/span&gt;&lt;/span&gt;&lt;/span&gt;&quot;,&quot;header&quot;:&quot;Choose your location&quot;}' data-action='a-modal'><a class='nav-a nav-a-2 a-popover-trigger a-declarative' tabindex='14'><div class='nav-sprite' id='nav-packard-glow-loc-icon'></div><div id='glow-ingress-block'><span class='nav-line-1' id='glow-ingress-line1'>Deliver to Sameer</span><span class='nav-line-2' id='glow-ingress-line2'>Navi Mumbai 400708&zwnj;</span></div></a></span><input data-addnewaddress='add-new' id='unifiedLocation1ClickAddress' name='dropdown-selection' type='hidden' value='jlohqontkkp'></input><input data-addnewaddress='add-new' id='ubbShipTo' name='dropdown-selection-ubb' type='hidden' value='jlohqontkkp'></input></div>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"      </div>\r\n" + 
				"      <div class='nav-right'>\r\n" + 
				"        <script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"        <div id='nav-tools'>\r\n" + 
				"          \r\n" + 
				"          \r\n" + 
				"          \r\n" + 
				"          \r\n" + 
				"          \r\n" + 
				"<a href=\"https://www.amazon.in/gp/css/homepage.html?ref=nav_youraccount_btn\" class=\"nav-a nav-a-2 nav-truncate\" data-nav-ref=\"nav_ya_signin\" data-nav-role=\"signin\" data-ux-jq-mouseenter=\"true\" id=\"nav-link-yourAccount\" tabindex=\"25\">\r\n" + 
				"  <span class=\"nav-line-1\">Hello, Sameer</span>\r\n" + 
				"  <span class=\"nav-line-2\">Your Orders<span class=\"nav-icon nav-arrow\"></span>\r\n" + 
				"  </span>\r\n" + 
				"  <span class=\"nav-line-3\">Hi Sameer</span>\r\n" + 
				"  <span class=\"nav-line-4\">Your Orders</span>\r\n" + 
				"</a>\r\n" + 
				"\r\n" + 
				"<a href=\"/gp/flex/sign-out.html?path=%2Fgp%2Fyourstore%2Fhome&signIn=1&useRedirectOnSuccess=1&action=sign-out&ref=nav_signout\" class=\"nav-hidden-aria\" tabindex=\"26\">\r\n" + 
				"  Not Sameer? Sign Out\r\n" + 
				"</a>\r\n" + 
				"\r\n" + 
				"          \r\n" + 
				"          \r\n" + 
				"<a href=\"/gp/prime?ref=nav_prime_try_btn\" class=\"nav-a nav-a-2\" data-ux-jq-mouseenter=\"true\" id=\"nav-link-prime\" tabindex=\"28\">\r\n" + 
				"  <span class=\"nav-line-1\">Try</span>\r\n" + 
				"  <span class=\"nav-line-2\">Prime<span class=\"nav-icon nav-arrow\"></span>\r\n" + 
				"  </span>\r\n" + 
				"</a>\r\n" + 
				"\r\n" + 
				"          \r\n" + 
				"<a href=\"/gp/registry/wishlist?ref=nav_wishlist_btn\" class=\"nav-a nav-a-2\" data-ux-jq-mouseenter=\"true\" id=\"nav-link-wishlist\" tabindex=\"29\">\r\n" + 
				"  <span class=\"nav-line-1\">Your</span>\r\n" + 
				"  <span class=\"nav-line-2\">Lists<span class=\"nav-icon nav-arrow\"></span>\r\n" + 
				"  </span>\r\n" + 
				"</a>\r\n" + 
				"\r\n" + 
				"          \r\n" + 
				"  <a href=\"https://www.amazon.in/gp/cart/view.html?ref=nav_cart\" aria-label=\"1 item in cart\" class=\"nav-a nav-a-2\" id=\"nav-cart\" tabindex=\"30\">\r\n" + 
				"    <span aria-hidden=\"true\" class=\"nav-line-1\"> </span>\r\n" + 
				"    <span aria-hidden=\"true\" class=\"nav-line-2\">Cart<span class=\"nav-icon nav-arrow\"></span>\r\n" + 
				"    </span>\r\n" + 
				"    <span class=\"nav-cart-icon nav-sprite\"></span>\r\n" + 
				"    <span id=\"nav-cart-count\" aria-hidden=\"true\" class=\"nav-cart-count nav-cart-1\">1</span>\r\n" + 
				"  </a>\r\n" + 
				"\r\n" + 
				"        </div>\r\n" + 
				"        <script type='text/javascript'>window.navmet.push({key:'Tools',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"      </div>\r\n" + 
				"      <div class='nav-fill'>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"          \r\n" + 
				"          \r\n" + 
				" <div id=\"nav-shop\">\r\n" + 
				"<a href=\"/gp/site-directory?ref=nav_shopall_btn\" class=\"nav-a nav-a-2\" data-ux-jq-mouseenter=\"true\" id=\"nav-link-shopall\" tabindex=\"15\">\r\n" + 
				"  <span class=\"nav-line-1\">Shop by</span>\r\n" + 
				"  <span class=\"nav-line-2\">Category<span class=\"nav-icon nav-arrow\"></span>\r\n" + 
				"  </span>\r\n" + 
				"</a>\r\n" + 
				"\r\n" + 
				" </div>\r\n" + 
				"          <div id='nav-xshop-container' class=''>\r\n" + 
				"            <div id='nav-xshop'>\r\n" + 
				"              \r\n" + 
				"              \r\n" + 
				"              <script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"<a id=\"nav-your-amazon\" href=\"/gp/yourstore/home?ref=nav_cs_ys\" class=\"nav-a\" tabindex=\"20\"><span id=\"nav-your-amazon-text\"><span class=\"nav-shortened-name\">Sameer</span>'s Amazon.in</span></a>\r\n" + 
				"\r\n" + 
				"<a href=\"/gp/goldbox?ref=nav_topnav_deals\" class=\"nav-a\" tabindex=\"21\">Today's Deals</a>\r\n" + 
				"\r\n" + 
				"<a href=\"/gp/sva/dashboard?ref=nav_apay\" class=\"nav-a\" tabindex=\"22\">Amazon Pay</a>\r\n" + 
				"\r\n" + 
				"<a href=\"/selling?ref=nav_cs_sell\" class=\"nav-a\" tabindex=\"23\">Sell</a>\r\n" + 
				"\r\n" + 
				"<a href=\"/gp/help/customer/display.html?nodeId=200507590&ref=nav_topnav_help\" class=\"nav-a\" tabindex=\"24\">Customer Service</a>\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'CrossShop',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"            </div>\r\n" + 
				"            \r\n" + 
				"            \r\n" + 
				"            \r\n" + 
				"            \r\n" + 
				"          </div>\r\n" + 
				"        \r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"    <div id='nav-subnav-toaster'></div>\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    <script type='text/javascript'>window.navmet.tmp=+new Date();</script>\r\n" + 
				"<div id='nav-subnav'>\r\n" + 
				"  \r\n" + 
				"</div>\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'Subnav',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"</header>\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'NavBar',end:+new Date(),begin:window.navmet.main});</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <script type='text/javascript'>window.navmet.tmp=+new Date();</script><!-- nav promo cached -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-Echo\" id=\"nav_imgmap_nav-sa-Echo\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,485\" href=\"/b/ref=nav_shopall_Neel_Flyout?_encoding=UTF8&node=14156834031&pf_rd_p=981cf47c-bad3-4759-9dfc-26cf9761be8d&pf_rd_s=nav-sa-Echo&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-Fire-TV\" id=\"nav_imgmap_nav-sa-Fire-TV\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,500\" href=\"/dp/B01EU2M62S/ref=nav_shopall_Tank_Flyout?pf_rd_p=de95f28b-16fb-46c5-aa02-b9c3b4b409c2&pf_rd_s=nav-sa-Fire-TV&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-automotive\" id=\"nav_imgmap_nav-sa-automotive\">\r\n" + 
				"<area shape=\"rect\" coords=\"1,0,498,478\" href=\"/b/ref=nav_shopall_nav_flyout?_encoding=UTF8&node=4772060031&pf_rd_p=5e44721a-0484-4e55-9a53-95782bd81b38&pf_rd_s=nav-sa-automotive&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"auto-hp\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-beauty-hpc\" id=\"nav_imgmap_nav-sa-beauty-hpc\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,450\" href=\"/b/ref=nav_shopall_?_encoding=UTF8&node=14786578031&pf_rd_p=d11d1a4d-fae4-42fd-bbed-c8e28fac3a97&pf_rd_s=nav-sa-beauty-hpc&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"Vedaka cooking essentials\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-books\" id=\"nav_imgmap_nav-sa-books\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,450\" href=\"/b/ref=nav_shopall_FlyoutBestReads?_encoding=UTF8&node=7145567031&pf_rd_p=b670b2bd-4b25-446f-bc7e-c88f95583c29&pf_rd_s=nav-sa-books&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"Amazon Best Reads-October\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-global-store\" id=\"nav_imgmap_nav-sa-global-store\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,485\" href=\"/b/ref=nav_shopall_AGSSBR17?_encoding=UTF8&node=11132091031&pf_rd_p=313af54c-65a7-4522-aef1-0d38266d376e&pf_rd_s=nav-sa-global-store&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-home-kitchen\" id=\"nav_imgmap_nav-sa-home-kitchen\">\r\n" + 
				"<area shape=\"rect\" coords=\"4,0,498,478\" href=\"/b/ref=nav_shopall_?_encoding=UTF8&node=10892568031&pf_rd_p=bee6bc42-9dcb-4243-82fa-16b8b0d57bf4&pf_rd_s=nav-sa-home-kitchen&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-kindle\" id=\"nav_imgmap_nav-sa-kindle\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,450\" href=\"/dp/B077454Z99/ref=prime_flyout/ref=nav_shopall_Diwali PEA?pf_rd_p=f5772bee-2b06-49cc-9218-9bf89627aba6&pf_rd_s=nav-sa-kindle&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-mens-fashion\" id=\"nav_imgmap_nav-sa-mens-fashion\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,498,497\" href=\"/s/ref=nav_shopall_mensfashion?_encoding=UTF8&amp%3Bie=UTF8&rh=i%3Afashion%2Cn%3A7459781031&pf_rd_p=effe02a5-adbf-4382-9786-9c43e3a18c80&pf_rd_s=nav-sa-mens-fashion&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"mens fashion\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-music-movies-games\" id=\"nav_imgmap_nav-sa-music-movies-games\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,498,497\" href=\"/gp/redirect.html/ref=nav_shopall_DMM_IN_FLY_PC_PhyMusic_July?location=https://www.amazon.in/music/prime&token=EF98464C81976A48893AB1D8E5D4350312D5B9C8&source=standards&pf_rd_p=2aa74db3-6008-4860-b04e-e62367b4fa23&pf_rd_s=nav-sa-music-movies-games&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-prime-music\" id=\"nav_imgmap_nav-sa-prime-music\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,450\" href=\"/gp/redirect.html/ref=nav_shopall_DMM_IN_fly_apm_mlp_June_lfs?location=https://www.amazon.in/music/prime&token=EF98464C81976A48893AB1D8E5D4350312D5B9C8&source=standards&pf_rd_p=541e6a5a-f81c-4a6a-8bc1-77945bf26f90&pf_rd_s=nav-sa-prime-music&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-prime-video\" id=\"nav_imgmap_nav-sa-prime-video\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,450\" href=\"/b/ref=nav_shopall_GNO_unrecfte_1A?_encoding=UTF8&node=10882806031&pf_rd_p=bf5563b0-617f-443f-be63-3d3495ec20d7&pf_rd_s=nav-sa-prime-video&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-sports-outdoors\" id=\"nav_imgmap_nav-sa-sports-outdoors\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,472,480\" href=\"/b/ref=fly_gym_fitness/ref=nav_shopall_nav_SPORTS?_encoding=UTF8&node=3403635031&pf_rd_p=36eee0c7-9038-4251-a9b6-59c93e9b31d8&pf_rd_s=nav-sa-sports-outdoors&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-toys-baby\" id=\"nav_imgmap_nav-sa-toys-baby\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,500,500\" href=\"/family/ref=nav_shopall_nav_toysbaby?pf_rd_p=c65955aa-d210-4da7-9730-c738913048bc&pf_rd_s=nav-sa-toys-baby&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"family\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-tv-appl-elec\" id=\"nav_imgmap_nav-sa-tv-appl-elec\">\r\n" + 
				"<area shape=\"rect\" coords=\"39,292,500,450\" href=\"/b/ref=nav_shopall_?_encoding=UTF8&node=11367485031&pf_rd_p=c3745dcc-af16-4a3c-8c47-f992bca3bc98&pf_rd_s=nav-sa-tv-appl-elec&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<map name=\"nav_imgmap_nav-sa-womens-fashion\" id=\"nav_imgmap_nav-sa-womens-fashion\">\r\n" + 
				"<area shape=\"rect\" coords=\"0,0,498,497\" href=\"/s/ref=nav_shopall_womensfashion?_encoding=UTF8&amp%3Bie=UTF8&rh=i%3Afashion%2Cn%3A7459780031&pf_rd_p=9ced1ca2-8f46-4f2a-8401-2cd01567adc0&pf_rd_s=nav-sa-womens-fashion&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=XF80BXD4Y9KFH87Y50D4\" alt=\"\"/>\r\n" + 
				"</map>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type=\"text/javascript\"><!--\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare(\"config.navDeviceType\", \"desktop\");\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.when(\"data\").run(function(data) { data({\"emptyWishlist\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"button\":{\"text\":\"Your Wish List\",\"url\":\"/gp/registry/wishlist/ref=nav_err_empty_wishlist/259-2484040-1898032\"},\"title\":\"Oops!\",\"paragraph\":\"Your list is empty\"}}}},\"yourAccountContent\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"button\":{\"text\":\"Your Account\",\"url\":\"/gp/css/homepage.html/ref=nav_err_youraccount/259-2484040-1898032\"},\"title\":\"Oops!\",\"paragraph\":\"There is a problem retrieving the list right now\"}}}},\"errorWishlist\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"button\":{\"text\":\"Your Wish List\",\"url\":\"/gp/registry/wishlist/ref=nav_err_wishlist/259-2484040-1898032\"},\"title\":\"Oops!\",\"paragraph\":\"There is a problem retrieving the list right now\"}}}},\"ewcTimeout\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"button\":{\"text\":\"Your Cart\",\"url\":\"/gp/cart/view.html/ref=nav_err_ewc_timeout/259-2484040-1898032\"},\"title\":\"Oops!\",\"paragraph\":\"There is a problem loading your cart right now\"}}}},\"cartTimeout\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"button\":{\"text\":\"Your Cart\",\"url\":\"/gp/cart/view.html/ref=nav_err_cart_timeout/259-2484040-1898032\"},\"title\":\"Oops!\",\"paragraph\":\"There is a problem loading your cart right now\"}}}},\"kindleTimeout\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"paragraph\":\"There is a problem retrieving the list right now\"}}}},\"shopAllTimeout\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"paragraph\":\"There is a problem retrieving the list right now\"}}}},\"primeTimeout\":{\"template\":{\"name\":\"flyoutError\",\"data\":{\"error\":{\"title\":\"<a href='/gp/prime'><img src='https://images-eu.ssl-images-amazon.com/images/G/31/prime/yourprime/yourprime-flyout-prime-fallback.jpg' /></a>\"}}}}}); });\r\n" + 
				"\r\n" + 
				"  window.$Nav && $Nav.when(\"util.templates\").run(\"FlyoutErrorTemplate\", function (templates) {\r\n" + 
				"    templates.add(\"flyoutError\", \"<# if(error.title) { #><span class='nav-title'><#=error.title #></span><# } #><# if(error.paragraph) { #><p class='nav-paragraph'><#=error.paragraph #></p><# } #><# if(error.button) { #><a href='<#=error.button.url #>' class='nav-action-button' ><span class='nav-action-inner'><#=error.button.text #></span></a><# } #>\");\r\n" + 
				"  });\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  window.$Nav && $Nav.when(\"data\").run(function(data) { data({}); });\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.navDebugHighres', false);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.upnavHighResImgInfo',\r\n" + 
				"  {\"upnav2xImageHeight\":\"\",\"upnav2xImagePath\":\"\"});\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.upnav2xAiryPreloadImgInfo',\r\n" + 
				"  {\"preloadImgPath\":\"\",\"preloadImgHeight\":\"\"});\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.upnav2xAiryPostSlateImgInfo',\r\n" + 
				"  {\"postslateImgHeight\":\"\",\"postslateImgPath\":\"\"});\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.pageType', 'CustomerReviews');\r\n" + 
				"window.$Nav && $Nav.declare('config.subPageType', '');\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.dynamicMenuUrl', '/gp/navigation/ajax/dynamic-menu.html/259-2484040-1898032');\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.dismissNotificationUrl',\r\n" + 
				"  '/gp/navigation/ajax/dismissnotification.html/259-2484040-1898032');\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.fixedSubBarBeacon',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.enableDynamicMenus', true);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.isInternal', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.isRecognized', true);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.transientFlyoutTrigger', '#nav-transient-flyout-trigger');\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.subnavFlyoutUrl',\r\n" + 
				"  '/gp/navigation/ajax/subnav-flyout/259-2484040-1898032');\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.recordEvUrl',\r\n" + 
				"  '/gp/navigation/ajax/recordevent.html/259-2484040-1898032');\r\n" + 
				"window.$Nav && $Nav.declare('config.recordEvInterval', 15000);\r\n" + 
				"window.$Nav && $Nav.declare('config.sessionId', '259-2484040-1898032');\r\n" + 
				"window.$Nav && $Nav.declare('config.requestId', '53RX2GATRXV3PYFHQG9N');\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.alexaListEnabled', true);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.readyOnATF', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.dynamicMenuArgs',\r\n" + 
				"  {\"rid\":\"53RX2GATRXV3PYFHQG9N\",\"isFullWidthPrime\":0,\"isPrime\":0,\"dynamicRequest\":1,\"weblabs\":\"\",\"isFreshRegionAndCustomer\":\"\",\"primeMenuWidth\":310});\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.customerName',\r\n" + 
				"  \"Sameer\");\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.yourAccountPrimeURL',\r\n" + 
				"  'https://www.amazon.in/gp/css/order-history/utils/first-order-for-customer.html/ref=ya_prefetch_beacon/259-2484040-1898032?ie=UTF8&s=259-2484040-1898032');\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.yourAccountPrimeHover', true);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.searchBackState',\r\n" + 
				"  {});\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    if (typeof uet == 'function') {\r\n" + 
				"      uet('bb', 'iss-init-pc', {wb: 1});\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    if (!window.$SearchJS && window.$Nav) {\r\n" + 
				"      window.$SearchJS = $Nav.make('sx');\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  var opts = {\r\n" + 
				"      host: \"completion.amazon.co.uk/search/complete\"\r\n" + 
				"    , marketId: \"44571\"\r\n" + 
				"    , obfuscatedMarketId: \"A21TJRUUN4KGV\"\r\n" + 
				"    , searchAliases: [\"aps\", \"amazonfresh\", \"amazon-devices\", \"stripbooks\", \"computers\", \"digital-text\", \"dvd\", \"electronics\", \"hpc\", \"kitchen\", \"furniture\", \"popular\", \"software\", \"videogames\", \"toys\", \"beauty\", \"baby\", \"watches\", \"jewelry\", \"luggage\", \"mobile-apps\", \"apparel\", \"shoes\", \"sporting\", \"gift-cards\", \"grocery\", \"mi\", \"office-products\", \"pets\", \"automotive\", \"industrial\", \"fashion\", \"appliances\", \"pantry\", \"lawngarden\", \"local-services\", \"luxury-beauty\", \"home-improvement\", \"amazon-global-store\", \"alexa-skills\", \"collectibles\"]\r\n" + 
				"    , filterAliases: [\"amazonfresh\"]\r\n" + 
				"    , pageType: \"CustomerReviews\"\r\n" + 
				"    , requestId: \"53RX2GATRXV3PYFHQG9N\"\r\n" + 
				"    , sessionId: \"259-2484040-1898032\"\r\n" + 
				"    , language: \"en_IN\"\r\n" + 
				"    , customerId: \"AXIICQMQ0IE6Y\"\r\n" + 
				"    , b2b: 0\r\n" + 
				"    , fresh: 0\r\n" + 
				"    , biaWidgetUrl: \"/gp/yourstore/259-2484040-1898032?ie=UTF8&edit=1&p=WOZo3B%2Fi92Z6ACsimdoV6cwMT5jW98bjW9Wq5GQxh96P%2BwASkqbWX%2FQbdJe6sIKTrwYSA2WeVK8Aydple9%2FLJJGqWmHwSshi&ref=nb_sb_ss_bia_acct\"\r\n" + 
				"    , isDdInT3: 0\r\n" + 
				"    , isDdInT1: 0\r\n" + 
				"    , isJpOrCn: 0\r\n" + 
				"    , isUseAuiIss: 1\r\n" + 
				"  };\r\n" + 
				"\r\n" + 
				"  var issOpts = {\r\n" + 
				"      fallbackFlag: 1\r\n" + 
				"    , isDigitalFeaturesEnabled: 0\r\n" + 
				"    , isWayfindingEnabled: 0\r\n" + 
				"    , dropdown: \"select.searchSelect\"\r\n" + 
				"    , departmentText: \"in {department}\"\r\n" + 
				"    , suggestionText: \"Search suggestions\"\r\n" + 
				"    , recentSearchesTreatment: \"C\"\r\n" + 
				"    , authorSuggestionText: \"all books by {author}\"\r\n" + 
				"    , recentSearchesText: \"Recent searches\"\r\n" + 
				"    , biaTitleText: \"\"\r\n" + 
				"    , biaPurchasedText: \"\"\r\n" + 
				"    , biaViewAllText: \"\"\r\n" + 
				"    , biaViewAllManageText: \"\"\r\n" + 
				"    , biaAndText: \"\"\r\n" + 
				"    , biaManageText: \"\"\r\n" + 
				"    , biaWeblabTreatment: \"\"\r\n" + 
				"    , issNavConfig: {\"weblabTreatments\":{\"SEARCH_ISS_174372\":\"C\",\"SEARCH_ISS_176725\":\"C\"}}\r\n" + 
				"    , np: 0\r\n" + 
				"    , issCorpus: []\r\n" + 
				"    , cf: 1\r\n" + 
				"    , useAmazonEmberFontFamily: \"1\"\r\n" + 
				"    , warmUpConnectionToCompletionSvc: \"1\"\r\n" + 
				"    , removeDeepNodeISS: \"\"\r\n" + 
				"    , trendingTreatment: \"C\"\r\n" + 
				"    , useAPIV2: \"\"\r\n" + 
				"    , opfSwitch: \"\"\r\n" + 
				"  };\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"  if (opts.isUseAuiIss === 1 && window.$Nav) {\r\n" + 
				"    window.$Nav.when('sx.iss').run('iss-mason-init', function(iss){\r\n" + 
				"      var issInitObj = buildIssInitObject(opts, issOpts, true);\r\n" + 
				"\r\n" + 
				"      new iss.IssParentCoordinator(issInitObj);\r\n" + 
				"\r\n" + 
				"      $SearchJS.declare('canCreateAutocomplete', issInitObj);\r\n" + 
				"    });\r\n" + 
				"  } else if (window.$SearchJS) {\r\n" + 
				"    \r\n" + 
				"    var iss;\r\n" + 
				"\r\n" + 
				"    // BEGIN Deprecated globals\r\n" + 
				"    var issHost = opts.host\r\n" + 
				"      , issMktid = opts.marketId\r\n" + 
				"      , issSearchAliases = opts.searchAliases\r\n" + 
				"      , updateISSCompletion = function() { iss.updateAutoCompletion(); };\r\n" + 
				"    // END deprecated globals\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    $SearchJS.when('jQuery', 'search-js-autocomplete-lib').run('autocomplete-init', initializeAutocomplete);\r\n" + 
				"    $SearchJS.when('canCreateAutocomplete').run('createAutocomplete', createAutocomplete);\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    if (opts.isDdInT3) {\r\n" + 
				"      $SearchJS.when('search-js-autocomplete').run('autocomplete-dd-init', function(){ mergeBTFDropdown(); });\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    if (opts.isDdInT1) {\r\n" + 
				"      $SearchJS.when('search-js-autocomplete').run('autocomplete-dd-init', function(){ searchDropdown(); });\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  } // END conditional for window.$SearchJS\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"  function initializeAutocomplete(jQuery) {\r\n" + 
				"    \r\n" + 
				"    var issInitObj = buildIssInitObject(opts, issOpts);\r\n" + 
				"    $SearchJS.declare('canCreateAutocomplete', issInitObj);\r\n" + 
				"  } // END initializeAutocomplete\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"  function initSearchCsl(searchCSL, issInitObject) {\r\n" + 
				"    searchCSL.init(opts.pageType, (window.ue && window.ue.rid) || opts.requestId);\r\n" + 
				"\r\n" + 
				"    $SearchJS.declare('canCreateAutocomplete', issInitObject);\r\n" + 
				"  } // END initSearchCsl\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"  function createAutocomplete(issObject) {\r\n" + 
				"    iss = new AutoComplete(issObject);\r\n" + 
				"\r\n" + 
				"    $SearchJS.publish('search-js-autocomplete', iss);\r\n" + 
				"\r\n" + 
				"    logMetrics();\r\n" + 
				"  } // END createAutocomplete\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  \r\n" + 
				"  function buildIssInitObject(opts, issOpts, isNewIss) {\r\n" + 
				"    var issInitObj = {\r\n" + 
				"        src: opts.host\r\n" + 
				"      , sessionId: opts.sessionId\r\n" + 
				"      , requestId: opts.requestId\r\n" + 
				"      , mkt: opts.marketId\r\n" + 
				"      , obfMkt: opts.obfuscatedMarketId\r\n" + 
				"      , pageType: opts.pageType\r\n" + 
				"      , language: opts.language\r\n" + 
				"      , customerId: opts.customerId\r\n" + 
				"      , fresh: opts.fresh\r\n" + 
				"      , b2b: opts.b2b\r\n" + 
				"      , aliases: opts.searchAliases\r\n" + 
				"      , fb: issOpts.fallbackFlag\r\n" + 
				"      , isDigitalFeaturesEnabled: issOpts.isDigitalFeaturesEnabled\r\n" + 
				"      , isWayfindingEnabled: issOpts.isWayfindingEnabled\r\n" + 
				"      , issPrimeEligible: issOpts.issPrimeEligible\r\n" + 
				"      , deptText: issOpts.departmentText\r\n" + 
				"      , sugText: issOpts.suggestionText\r\n" + 
				"      , filterAliases: opts.filterAliases\r\n" + 
				"      , biaWidgetUrl: opts.biaWidgetUrl\r\n" + 
				"      , recentSearchesTreatment: issOpts.recentSearchesTreatment\r\n" + 
				"      , authorSuggestionText: issOpts.authorSuggestionText\r\n" + 
				"      , recentSearchesText: issOpts.recentSearchesText\r\n" + 
				"      , biaTitleText: issOpts.biaTitleText\r\n" + 
				"      , biaPurchasedText: issOpts.biaPurchasedText\r\n" + 
				"      , biaViewAllText: issOpts.biaViewAllText\r\n" + 
				"      , biaViewAllManageText: issOpts.biaViewAllManageText\r\n" + 
				"      , biaAndText: issOpts.biaAndText\r\n" + 
				"      , biaManageText: issOpts.biaManageText\r\n" + 
				"      , biaWeblabTreatment: issOpts.biaWeblabTreatment\r\n" + 
				"      , issNavConfig: issOpts.issNavConfig\r\n" + 
				"      , cf: issOpts.cf\r\n" + 
				"      , ime: opts.isJpOrCn\r\n" + 
				"      , mktid: opts.marketId\r\n" + 
				"      , qs: opts.isJpOrCn\r\n" + 
				"      , issCorpus: issOpts.issCorpus\r\n" + 
				"      , deepNodeISS: {\r\n" + 
				"          searchAliasAccessor: function($) {\r\n" + 
				"            return (window.SearchPageAccess && window.SearchPageAccess.searchAlias()) ||\r\n" + 
				"                   $('select.searchSelect').children().attr('data-root-alias');\r\n" + 
				"          },\r\n" + 
				"          searchAliasDisplayNameAccessor: function() {\r\n" + 
				"            return (window.SearchPageAccess && window.SearchPageAccess.searchAliasDisplayName());\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"      , useAmazonEmberFontFamily: issOpts.useAmazonEmberFontFamily\r\n" + 
				"      , warmUpConnectionToCompletionSvc: issOpts.warmUpConnectionToCompletionSvc\r\n" + 
				"      , removeDeepNodeISS: issOpts.removeDeepNodeISS\r\n" + 
				"      , trendingTreatment: issOpts.trendingTreatment\r\n" + 
				"      , useAPIV2: issOpts.useAPIV2\r\n" + 
				"      , opfSwitch: issOpts.opfSwitch\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    // If we aren't using the new ISS then we need to add these properties\r\n" + 
				"    if (!isNewIss) {\r\n" + 
				"      issInitObj.dd = issOpts.dropdown; // The element with id searchDropdownBox doesn't exist in C.\r\n" + 
				"      issInitObj.imeSpacing = issOpts.imeSpacing;\r\n" + 
				"      issInitObj.isNavInline = 1;\r\n" + 
				"      issInitObj.triggerISSOnClick = 0;\r\n" + 
				"      issInitObj.sc = 1;\r\n" + 
				"      issInitObj.np = issOpts.np;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    return issInitObj;\r\n" + 
				"  } // END buildIssInitObject\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  function logMetrics() {\r\n" + 
				"    if (typeof uet == 'function' && typeof uex == 'function' ) {\r\n" + 
				"      uet('be', 'iss-init-pc', {wb: 1});\r\n" + 
				"      uex('ld', 'iss-init-pc', {wb: 1});\r\n" + 
				"    }\r\n" + 
				"  } // END logMetrics\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    window.$Nav && $Nav.declare('nav.inline');\r\n" + 
				"\r\n" + 
				"(function (i) {\r\n" + 
				"i.onload = function() {window.uet && uet('ne')};\r\n" + 
				"i.src = window._navbarSpriteUrl;\r\n" + 
				"}(new Image()));\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.autoFocus', false);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.responsiveTouchAgents', [\"ieTouch\"]);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.responsiveGW',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.pageHideEnabled',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.sslTriggerType','');\r\n" + 
				"window.$Nav && $Nav.declare('config.sslTriggerRetry',0);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.doubleCart',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.newTabClick', {\"targetUrlPatterns\":[\"/(dp/[0-9a-zA-Z]{10}|gp/product/[0-9a-zA-Z]{10}|mn/detailApp)(/|$)\"]});\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.fixedBarBeacon',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.signInOverride', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.signInTooltip',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.isPrimeMember',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.packardGlowTooltip', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.packardGlowFlyout', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.rightMarginAlignEnabled', true);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.flyoutAnimation', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.campusActivation', '');\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"\r\n" + 
				"    window.$Nav && $Nav.declare('config.primeTooltip',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.primeDay',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.disableBuyItAgain', false);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    window.$Nav && $Nav.declare('config.pseudoPrimeFirstBrowse',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.sdaYourAccount',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.csYourAccount',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.cartFlyoutDisabled', true);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.navfresh', false);\r\n" + 
				"window.$Nav && $Nav.declare('config.isFreshRegion', false);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.ewc', false);if (window.ue && ue.tag) { ue.tag('noewc'); }\r\n" + 
				"if (window.ue && ue.tag) { ue.tag('navbar'); };\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.blackbelt', true);\r\n" + 
				"window.$Nav && $Nav.declare('config.beaconbelt', true);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.beaconbeltCover', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.accountList', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.pinnedNav',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.pinnedNavWithEWC',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.pinnedNavStart',700);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.pinnedNavMinWidth',1000);\r\n" + 
				"window.$Nav && $Nav.declare('config.pinnedNavMinHeight',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.iPadTablet', false);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.searchapiEndpoint',false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.timeline', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.timelineAsinPriceEnabled', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.timelineDeleteEnabled',false);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.searchTimeline', false);\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.searchTopCategories', false);\r\n" + 
				"\r\n" + 
				"    window._navbar = window._navbar || {};\r\n" + 
				"    window._navbar.browsepromos = window._navbar.browsepromos || {};\r\n" + 
				"    \r\n" + 
				" _navbar.browsepromos['nav-sa-Echo'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/AmazonDevices/Neel/500x450_Flyout._CB481765061_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-Fire-TV'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/AmazonDevices/Tank/1092710_IN_Fire_TV_black_Flyout_500x450_2._CB489239939_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-automotive'] = {\"width\":\"499\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"580\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img17/Auto/May17/1047727_gps_automotive_flyout_499x580._CB509021159_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-beauty-hpc'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"-1\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":\"Vedaka cooking essentials\",\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/Vedaka/Overall/Flyout_1538743315._CB482684128_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-books'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":\"Amazon Best Reads-October\",\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/Books/092018/BestReads/1139101_in_books_amazon_best_reads_oct2018_500x450_1537991736._CB484322401_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-global-store'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img17/imports/AGS/Newflyouts/1059960_Flyout_500x450_gps_cn._CB504077997_.jpg\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-home-kitchen'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"-1\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/IMG-2017/GW_Flyout_500x450_Flyout._CB487102089_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-kindle'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"479\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/AmazonDevices/kindle/Layer-2_1539245734._CB481385074_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-mens-fashion'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"-1\",\"height\":\"450\",\"altText\":\"mens fashion\",\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/Fashion/August18/FLYOUT_M._CB472752877_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-music-movies-games'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/digital/music/merch/India/2018/July/1123712_in_pdm_fpd42_500x450_1531481094._CB473943888_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-prime-music'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/digital/music/merch/India/2018/June/1120549_IN_Amazon_Prime_Music_Flyout_500x450_1._CB476749930_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-prime-video'] = {\"width\":\"499\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"492\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/AmazonVideo/2018/SingleTitle/FanneyKhan/499x492-GNO_v2._CB481700282_.jpg\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-sports-outdoors'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"-1\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img17/Sports/Exercise_Fitness/Get_fit_at_home/gym_essentials/flyout._CB505942756_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-toys-baby'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/Family/flyout_new_last_1534496402_1534508273._CB470411914_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-tv-appl-elec'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"-1\",\"tabletAltText\":null,\"horizOffset\":\"0\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img17/TV/Flyout/1050726_InternetTV_flyout-2._CB505081595_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				" _navbar.browsepromos['nav-sa-womens-fashion'] = {\"width\":\"500\",\"promoType\":\"wide\",\"vertOffset\":\"0\",\"tabletAltText\":null,\"horizOffset\":\"-1\",\"height\":\"450\",\"altText\":null,\"image\":\"https://images-eu.ssl-images-amazon.com/images/G/31/img18/Fashion/Flyout/new/500x450-women._CB495137648_.png\",\"tabletDestination\":null,\"tabletImage\":null}; \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    window.$Nav && $Nav.declare('config.browsePromos', window._navbar.browsepromos);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.extendedFlyout', false);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('config.pssFlag', 0);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"if (window.P && typeof window.P.declare === \"function\" && typeof window.P.now === \"function\") {\r\n" + 
				"  window.P.now('packardGlowIngressJsEnabled').execute(function(glowEnabled) {\r\n" + 
				"    if (!glowEnabled) {\r\n" + 
				"      window.P.declare('packardGlowIngressJsEnabled', true);\r\n" + 
				"    }\r\n" + 
				"  });\r\n" + 
				"  window.P.now('packardGlowStoreName').execute(function(storeName) {\r\n" + 
				"    if (!storeName) {\r\n" + 
				"      window.P.declare('packardGlowStoreName', 'CustomerReviewsHorizonteApp');\r\n" + 
				"    }\r\n" + 
				"  });\r\n" + 
				"    window.P.declare('packardSpeedDesktopEnabled', true);\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"window.$Nav && $Nav.declare('configComplete');\r\n" + 
				"\r\n" + 
				"--></script>\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>window.navmet.push({key:'PostNav',end:+new Date(),begin:window.navmet.tmp});</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type='text/javascript'>window.navmet.MainEnd = new Date();</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div class=\"a-container\"><noscript>\r\n" + 
				"        <div class=\"a-section a-spacing-large a-spacing-top-mini a-text-center\"><div class=\"a-box a-alert a-alert-warning reviews-no-js-warning\"><div class=\"a-box-inner a-alert-container\"><i class=\"a-icon a-icon-alert\"></i><div class=\"a-alert-content\">This page works best with JavaScript. Disabling it will result in some disabled or missing features. You can still see all customer reviews for the product.</div></div></div></div></noscript>\r\n" + 
				"\r\n" + 
				"      <div class=\"a-fixed-right-grid\"><div class=\"a-fixed-right-grid-inner\" style=\"padding-right:300px\"><div class=\"a-fixed-right-grid-col a-col-left\" style=\"padding-right:3.5%;float:left;\"><h1 id=\"cr-customer-review\">Customer Review</h1><span id=\"cr-state-object\" data-state='{\"asin\":\"B077PW9V3J\",\"customerId\":\"AXIICQMQ0IE6Y\",\"deviceType\":\"desktop\",\"reviewCommentsAjaxUrl\":\"/hz/reviews-render/ajax/comment/get/\",\"reviewCommentSubmissionAjaxUrl\":\"/hz/reviews-render/ajax/comment/submit/\",\"approvedAuthorAjaxUrl\":\"/hz/reviews-render/ajax/approved-author/get/\",\"reviewsAjaxUrl\":\"/hz/reviews-render/ajax/reviews/get/\",\"medleyReviewsAjaxUrl\":\"\",\"signinUrl\":\"https://www.amazon.in/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J?ie\\u003dUTF8\",\"weblabTriggerUrl\":\"/hz/reviews-render/ajax/weblab-trigger\",\"reftagTriggerUrl\":\"/hz/reviews-render/ajax/reftag-trigger\",\"mobileImageGalleryUrl\":\"\",\"getImagesAjaxUrl\":\"\",\"productInfoUrl\":\"/hz/reviews-render/ajax/product-info/get/\",\"disableScroll\":true}'></span>\r\n" + 
				"<div id=\"cm_cr-review_list\" class=\"a-section a-spacing-none review-views celwidget\"><div id=\"R10SZ3VAMCLDPE\" data-hook=\"review\" class=\"a-section review\"><div id=\"customer_review-R10SZ3VAMCLDPE\" class=\"a-section celwidget\"><div class=\"a-row\"><a class=\"a-link-normal\" title=\"5.0 out of 5 stars\" href=\"/gp/customer-reviews/R10SZ3VAMCLDPE/ref=cm_cr_srp_d_rvw_ttl?ie=UTF8&amp;ASIN=B077PW9V3J\"><i data-hook=\"review-star-rating\" class=\"a-icon a-icon-star a-star-5 review-rating\"><span class=\"a-icon-alt\">5.0 out of 5 stars</span></i></a><span class=\"a-letter-space\"></span><a data-hook=\"review-title\" class=\"a-size-base a-link-normal review-title a-color-base a-text-bold\" href=\"/gp/customer-reviews/R10SZ3VAMCLDPE/ref=cm_cr_srp_d_rvw_ttl?ie=UTF8&amp;ASIN=B077PW9V3J\">If on Tight budget - Need a phone for calls, WhatsApp, etc. - you are in the right place - REDMI 6A</a></div><div class=\"a-row\"><span data-hook=\"review-author\" class=\"a-size-base a-color-secondary review-byline\"><span class=\"a-color-secondary\">By</span><span class=\"a-letter-space\"></span><a data-hook=\"review-author\" class=\"a-size-base a-link-normal author\" href=\"/gp/profile/amzn1.account.AGDKKEJ4Y4CTLHGTFCPPLUXLW32Q/ref=cm_cr_srp_d_pdp?ie=UTF8\">Dr. Mysterious</a></span><span class=\"a-letter-space\"></span><span data-hook=\"review-date\" class=\"a-size-base a-color-secondary review-date\">on 20 September 2018</span></div><div class=\"a-row a-spacing-mini review-data review-format-strip\"><span class=\"a-declarative\" data-action=\"reviews:filter-action:push-state\" data-reviews:filter-action:push-state=\"{}\"><a data-reftag=\"cm_cr_srp_d_rvw_rvwer\" data-reviews-state-param=\"{&quot;pageNumber&quot;:&quot;1&quot;,&quot;reviewerType&quot;:&quot;avp_only_reviews&quot;}\" class=\"a-link-normal\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_rvw_rvwer?ie=UTF8&amp;reviewerType=avp_only_reviews\"><span data-hook=\"avp-badge\" class=\"a-size-mini a-color-state a-text-bold\">Verified Purchase</span></a></span></div><div class=\"a-row a-spacing-small review-data\"><span data-hook=\"review-body\" class=\"a-size-base review-text\">The phone is looking good for usage and hands on.<br /><br />Lot of pre-installed apps are there in a budget phone, not good for memory.<br /><br />There is dual nano SIM slot with SD card insert option, which is good.<br /><br />For parents or persons, who is just using the phone for speaking and WhatsApp,etc with no multi-tasking ...this is a good option in the current market of September 2018.</span></div><div class=\"a-row review-comments comments-for-R10SZ3VAMCLDPE\"><div data-reftag=\"cm_cr_srp_d_cmt_opn\" aria-live=\"polite\" data-a-expander-name=\"review_comment_expander\" class=\"a-row a-expander-container a-expander-inline-container\"><span class=\"cr-vote\" data-hook=\"review-voting-widget\">\r\n" + 
				"\r\n" + 
				"  <div class=\"a-row a-spacing-small\"><span data-hook=\"helpful-vote-statement\" class=\"a-size-base a-color-tertiary cr-vote-text cr-vote-error cr-vote-component\">47 people found this helpful</span><span data-hook=\"helpful-vote-statement\" class=\"a-size-base a-color-tertiary cr-vote-text cr-vote-feedback cr-vote-success cr-vote-component aok-hidden\">48 people found this helpful</span></div><div class=\"cr-vote-component cr-helpful-icon-margin-right cr-vote-error aok-float-left\" data-hook=\"vote-helpful-button\">\r\n" + 
				"      <span class=\"a-declarative\" data-action=\"reviews:vote-action\" data-reviews:vote-action=\"{&quot;voteInstanceId&quot;:&quot;R10SZ3VAMCLDPE&quot;,&quot;ajaxUrl&quot;:&quot;/hz/reviews-render/ajax/vote/submit/ref=cm_cr_srp_d_vote_lft&quot;,&quot;voteValue&quot;:&quot;1&quot;,&quot;cssSelectors&quot;:{&quot;onError&quot;:&quot;.cr-vote-error&quot;,&quot;inFlight&quot;:&quot;.cr-vote-feedback&quot;,&quot;hideVoteComponents&quot;:&quot;.cr-vote-component&quot;,&quot;onSuccess&quot;:&quot;.cr-vote-success&quot;},&quot;csrfT&quot;:&quot;gsQ7OF9y5xpG8l1XdetYSMeBqX9rg0QqEFYWFqwAAAABAAAAAFvIkvFyYXcAAAAA+4kUEk/7iMGR3xPcX6iU&quot;,&quot;allowLinkDefault&quot;:&quot;1&quot;,&quot;voteDimension&quot;:&quot;Helpful&quot;}\"><a class=\"a-size-base a-link-normal a-color-secondary a-text-normal\" href=\"https://www.amazon.in/hz/reviews-render/srp/-/R10SZ3VAMCLDPE/ref=cm_cr_srp_d_vote_lft?ie=UTF8&amp;voteInstanceId=R10SZ3VAMCLDPE&amp;voteValue=1&amp;csrfT=gsQ7OF9y5xpG8l1XdetYSMeBqX9rg0QqEFYWFqwAAAABAAAAAFvIkvFyYXcAAAAA%2B4kUEk%2F7iMGR3xPcX6iU\"><div class=\"cr-helpful-icon aok-inline-block aok-align-center\"></div>\r\n" + 
				"\r\n" + 
				"          <div class=\"aok-inline-block aok-align-center\">\r\n" + 
				"            <span class=\"a-size-base\">Helpful</span></div>\r\n" + 
				"\r\n" + 
				"        </a></span></div>\r\n" + 
				"\r\n" + 
				"    <div class=\"aok-hidden cr-vote-component cr-helpful-icon-margin-right cr-vote-success cr-vote-feedback aok-float-left\">\r\n" + 
				"      <span class=\"a-size-base a-color-secondary\"><div class=\"cr-helpful-icon-clicked aok-inline-block aok-align-center\"></div>\r\n" + 
				"\r\n" + 
				"        <div class=\"aok-inline-block aok-align-center\">\r\n" + 
				"          Helpful</div>\r\n" + 
				"\r\n" + 
				"      </span></div>\r\n" + 
				"\r\n" + 
				"  <i class=\"a-icon a-icon-text-separator\" role=\"img\" aria-label=\"|\"></i></span>\r\n" + 
				"<a href=\"javascript:void(0)\" data-action=\"a-expander-toggle\" class=\"a-expander-header a-declarative a-expander-inline-header a-link-expander\" data-a-expander-toggle=\"{&quot;allowLinkDefault&quot;:true, &quot;expand_prompt&quot;:&quot;&quot;, &quot;collapse_prompt&quot;:&quot;&quot;}\"><i class=\"a-icon a-icon-collapse\"></i><span class=\"a-expander-prompt\"><span class=\"review-comment-total aok-hidden\">1</span><span class=\"a-size-base\">1 Comment</span></span></a><span class=\"cr-footer-line-height\">\r\n" + 
				"      <span><i class=\"a-icon a-icon-text-separator\" role=\"img\" aria-label=\"|\"></i><span class=\"a-declarative\" data-action=\"cr-popup\" data-cr-popup=\"{&quot;width&quot;:&quot;580&quot;,&quot;title&quot;:&quot;ReportAbuse&quot;,&quot;url&quot;:&quot;/hz/reviews-render/report-abuse?ie=UTF8&amp;voteDomain=Reviews&amp;ref=cm_cr_srp_d_rvw_hlp&amp;csrfT=gsQ7OF9y5xpG8l1XdetYSMeBqX9rg0QqEFYWFqwAAAABAAAAAFvIkvFyYXcAAAAA%2B4kUEk%2F7iMGR3xPcX6iU&amp;entityId=R10SZ3VAMCLDPE&amp;sessionId=259-2484040-1898032&quot;,&quot;height&quot;:&quot;380&quot;}\"><a class=\"a-size-base a-link-normal a-color-secondary report-abuse-link a-text-normal\" href=\"/hz/reviews-render/report-abuse?ie=UTF8&amp;voteDomain=Reviews&amp;ref=cm_cr_srp_d_rvw_hlp&amp;csrfT=gsQ7OF9y5xpG8l1XdetYSMeBqX9rg0QqEFYWFqwAAAABAAAAAFvIkvFyYXcAAAAA%2B4kUEk%2F7iMGR3xPcX6iU&amp;entityId=R10SZ3VAMCLDPE&amp;sessionId=259-2484040-1898032\">Report abuse</a></span></span></span>\r\n" + 
				"\r\n" + 
				"    <i class=\"a-icon a-icon-text-separator\" role=\"img\" aria-label=\"|\"></i><a class=\"a-color-secondary\" data-hook=\"review-permalink\" href=\"https://www.amazon.in/review/R10SZ3VAMCLDPE/ref=cm_cr_srp_d_rdp_perm?ie=UTF8&ASIN=B077PW9V3J\">\r\n" + 
				"  Permalink</a><div aria-expanded=\"true\" class=\"a-expander-content a-spacing-top-base a-spacing-large a-expander-inline-content a-expander-inner\"><div class=\"a-column a-span12 a-text-right a-spacing-base\"><span class=\"a-declarative\" data-action=\"reviews:ajax-post\" data-reviews:ajax-post=\"{&quot;removeOnLoadSelector&quot;:&quot;.submission-button-for-R10SZ3VAMCLDPE&quot;,&quot;indicatorSelector&quot;:&quot;.comment-submission-loading-R10SZ3VAMCLDPE&quot;,&quot;params&quot;:{&quot;reviewId&quot;:&quot;R10SZ3VAMCLDPE&quot;},&quot;showOnFailureSelector&quot;:&quot;.comment-submission-error-R10SZ3VAMCLDPE&quot;,&quot;url&quot;:&quot;/hz/reviews-render/ajax/comment-submission/get/ref=cm_cr_srp_d_btn&quot;}\"><span class=\"a-button a-button-base open-comment-submission-button submission-button-for-R10SZ3VAMCLDPE\"><span class=\"a-button-inner\"><input data-reftag=\"cm_cr_srp_d_cmt_submn\" class=\"a-button-input\" type=\"submit\"><span class=\"a-button-text\" aria-hidden=\"true\">Comment</span></span></span></span></div><span id=\"comment-submission-for-R10SZ3VAMCLDPE\">\r\n" + 
				"\r\n" + 
				"  <div class=\"a-section a-spacing-extra-large a-spacing-top-medium a-text-center comment-submission-loading-R10SZ3VAMCLDPE comment-submission-metadata\"><span class=\"a-spinner a-spinner-medium a-spacing-top-medium a-spacing-extra-large\"></span></div><div class=\"a-section a-spacing-extra-large a-spacing-top-medium a-text-center comment-submission-error-R10SZ3VAMCLDPE comment-submission-metadata\"><div class=\"a-box a-alert a-alert-error cr-error\" aria-live=\"assertive\" role=\"alert\"><div class=\"a-box-inner a-alert-container\"><h4 class=\"a-alert-heading\">There was a problem loading comments right now. Please try again later.</h4><i class=\"a-icon a-icon-alert\"></i><div class=\"a-alert-content\"></div></div></div></div></span>\r\n" + 
				"<div class=\"a-row a-spacing-mini review-comments-header\"><ul class=\"a-viewoptions-list a-viewoptions-section a-span12\">\r\n" + 
				"    <div class=\"a-row a-spacing-none a-grid-vertical-align a-grid-center\"><div class=\"a-column a-span6\"><span class=\"a-size-base a-viewoptions-list-label\">Showing <span class='review-comment-count'>0</span> comments</span></div><div class=\"a-column a-span6 a-text-right a-span-last\"><span class=\"a-size-base a-viewoptions-list-label\">Sort by:<span class=\"a-letter-space\"></span></span><span class=\"a-declarative\" data-action=\"reviews:sort-comments\" data-reviews:sort-comments=\"{}\"><li class=\"sort-newest a-viewoptions-list-item a-selected a-color-state\">\r\n" + 
				"            <a data-reftag=\"cm_cr_srp_d_cmt_lft\" class=\"a-link-normal a-selected a-color-state\" href=\"#\">Newest</a></li>\r\n" + 
				"          <li class=\"sort-oldest a-viewoptions-list-item\">\r\n" + 
				"            <a data-reftag=\"cm_cr_srp_d_cmt_rgt\" class=\"a-link-normal\" href=\"#\">Oldest</a></li>\r\n" + 
				"        </span></div></div></ul>\r\n" + 
				"</div><div class=\"a-section a-spacing-extra-large a-spacing-top-medium a-text-center comment-load-error aok-hidden\"><div class=\"a-box a-alert a-alert-error cr-error\" aria-live=\"assertive\" role=\"alert\"><div class=\"a-box-inner a-alert-container\"><h4 class=\"a-alert-heading\">There was a problem loading comments right now. Please try again later.</h4><i class=\"a-icon a-icon-alert\"></i><div class=\"a-alert-content\"></div></div></div></div><div id=\"R10SZ3VAMCLDPE\" class=\"a-section a-spacing-none review-comments\"></div><div class=\"a-spinner-wrapper comment-loading aok-hidden a-spacing-top-medium a-spacing-extra-large\"><span class=\"a-spinner a-spinner-medium\"></span></div><hr class=\"a-spacing-none a-spacing-top-large a-divider-normal\"></div></div></div></div></div></div></div><div class=\"a-fixed-right-grid-col a-col-right\" style=\"width:300px;margin-right:-300px;float:left;\"><script>\r\n" + 
				"            if (typeof uet == 'function') {\r\n" + 
				"              uet('bb', \"srpProductDetails\", {wb: 1});  \r\n" + 
				"              uet('bb', \"srpSummary\", {wb: 1});  \r\n" + 
				"            }\r\n" + 
				"          </script>\r\n" + 
				"\r\n" + 
				"          <h3 id=\"cr-product-details\" class=\"a-spacing-mini\">Product Details</h3><div class=\"a-fixed-left-grid a-spacing-mini\"><div class=\"a-fixed-left-grid-inner\" style=\"padding-left:60px\"><div class=\"a-fixed-left-grid-col a-col-left\" style=\"width:60px;margin-left:-60px;float:left;\"><a class=\"a-link-normal\" href=\"/Redmi-6A-Black-2GBRAM-Storage/dp/B077PW9V3J/ref=cm_cr_srp_d_pdt_img_top?ie=UTF8\"><img alt=\"\" src=\"https://m.media-amazon.com/images/I/314XWaPUwlL._AC_US60_SCLZZZZZZZ__.jpg\" height=\"60\" width=\"60\" data-a-hires=\"https://m.media-amazon.com/images/I/314XWaPUwlL._AC_US120_SCLZZZZZZZ__.jpg\"></a></div><div class=\"a-fixed-left-grid-col a-col-right\" style=\"padding-left:3%;float:left;\"><div class=\"a-row a-spacing-top-mini a-text-ellipsis\"><a data-hook=\"product-link\" class=\"a-link-normal\" href=\"/Redmi-6A-Black-2GBRAM-Storage/dp/B077PW9V3J/ref=cm_cr_srp_d_product_top?ie=UTF8\">Redmi 6A (Black, 2GBRAM, 16GB Storage)</a></div><div class=\"a-row\"><span class=\"a-size-base\">by</span><span class=\"a-letter-space\"></span><a class=\"a-size-base a-link-normal\" href=\"/s/ref=cm_cr_srp_d_pdt_bl_sr?ie=UTF8&amp;field-keywords=Mi\">Mi</a></div></div></div></div><script>\r\n" + 
				"            if (typeof uex == 'function') {\r\n" + 
				"              uex('ld', \"srpProductDetails\", {wb: 1});  \r\n" + 
				"            }\r\n" + 
				"            if (typeof uet == 'function') {\r\n" + 
				"              uet('af', \"srpSummary\", {wb: 1});  \r\n" + 
				"            }\r\n" + 
				"          </script>\r\n" + 
				"\r\n" + 
				"          <div class=\"a-row a-spacing-small\"><div class=\"a-row averageStarRatingIconAndCount\"><div class=\"a-fixed-left-grid AverageCustomerReviews\"><div class=\"a-fixed-left-grid-inner\" style=\"padding-left:100px\"><div class=\"a-fixed-left-grid-col a-col-left\" style=\"width:100px;margin-left:-100px;float:left;\"><i data-hook=\"average-star-rating\" class=\"a-icon a-icon-star-medium a-star-medium-4-5 averageStarRating\"><span class=\"a-icon-alt\">4.3 out of 5 stars</span></i></div><div class=\"a-fixed-left-grid-col a-col-right\" style=\"padding-left:0%;float:left;\"><div class=\"a-row\"><span data-hook=\"total-review-count\" class=\"a-size-medium totalReviewCount\">1,212</span></div></div></div></div></div><div class=\"a-row averageStarRatingNumerical\"><span class=\"a-declarative\" data-action=\"a-popover\" data-a-popover=\"{&quot;inlineContent&quot;:&quot;Amazon calculates a product's star ratings based on a machine learned model instead of a raw data average. The model takes into account factors including the age of a rating, whether the ratings are from verified purchasers and factors that establish reviewer trustworthiness.&quot;}\"><a href=\"javascript:void(0)\" class=\"a-popover-trigger a-declarative\"><span data-hook=\"rating-out-of-text\" class=\"arp-rating-out-of-text\">4.3 out of 5 stars</span><i class=\"a-icon a-icon-popover\"></i></a></span></div></div><div class=\"a-row a-spacing-base\"><span class=\"a-declarative\" data-action=\"\" data-=\"{}\"><table id=\"histogramTable\" class=\"a-normal a-align-middle a-spacing-base\" role=\"presentation\"><tr data-reftag=\"cm_cr_srp_d_hist_5\" data-reviews-state-param=\"{&quot;filterByStar&quot;:&quot;five_star&quot;,&quot;pageNumber&quot;:&quot;1&quot;}\" class=\"a-histogram-row\"><td class=\"aok-nowrap\"><a aria-label=\"5 star (60%)\" class=\"a-size-base a-link-normal 5star\" title=\"5 star\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_5?ie=UTF8&amp;filterByStar=five_star&amp;reviewerType=all_reviews#reviews-filter-bar\">5 star</a><span class=\"a-letter-space\"></span></td><td aria-hidden=\"true\" class=\"a-span10\"><a class=\"a-size-base a-link-normal\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_5?ie=UTF8&amp;filterByStar=five_star&amp;reviewerType=all_reviews#reviews-filter-bar\"><div class=\"a-meter 5star\" aria-label=\"60%\"><div class=\"a-meter-bar\" style=\"width: 60%;\"></div></div></a></td><td aria-hidden=\"true\" class=\"a-text-right aok-nowrap\"><a class=\"a-size-base a-link-normal 5star histogram-review-count\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_5?ie=UTF8&amp;filterByStar=five_star&amp;reviewerType=all_reviews#reviews-filter-bar\">60%</a><span class=\"a-letter-space\"></span></td></tr><tr data-reftag=\"cm_cr_srp_d_hist_4\" data-reviews-state-param=\"{&quot;filterByStar&quot;:&quot;four_star&quot;,&quot;pageNumber&quot;:&quot;1&quot;}\" class=\"a-histogram-row\"><td class=\"aok-nowrap\"><a aria-label=\"4 star (23%)\" class=\"a-size-base a-link-normal 4star\" title=\"4 star\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_4?ie=UTF8&amp;filterByStar=four_star&amp;reviewerType=all_reviews#reviews-filter-bar\">4 star</a><span class=\"a-letter-space\"></span></td><td aria-hidden=\"true\" class=\"a-span10\"><a class=\"a-size-base a-link-normal\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_4?ie=UTF8&amp;filterByStar=four_star&amp;reviewerType=all_reviews#reviews-filter-bar\"><div class=\"a-meter 4star\" aria-label=\"23%\"><div class=\"a-meter-bar\" style=\"width: 23%;\"></div></div></a></td><td aria-hidden=\"true\" class=\"a-text-right aok-nowrap\"><a class=\"a-size-base a-link-normal 4star histogram-review-count\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_4?ie=UTF8&amp;filterByStar=four_star&amp;reviewerType=all_reviews#reviews-filter-bar\">23%</a><span class=\"a-letter-space\"></span></td></tr><tr data-reftag=\"cm_cr_srp_d_hist_3\" data-reviews-state-param=\"{&quot;filterByStar&quot;:&quot;three_star&quot;,&quot;pageNumber&quot;:&quot;1&quot;}\" class=\"a-histogram-row\"><td class=\"aok-nowrap\"><a aria-label=\"3 star (7%)\" class=\"a-size-base a-link-normal 3star\" title=\"3 star\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_3?ie=UTF8&amp;filterByStar=three_star&amp;reviewerType=all_reviews#reviews-filter-bar\">3 star</a><span class=\"a-letter-space\"></span></td><td aria-hidden=\"true\" class=\"a-span10\"><a class=\"a-size-base a-link-normal\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_3?ie=UTF8&amp;filterByStar=three_star&amp;reviewerType=all_reviews#reviews-filter-bar\"><div class=\"a-meter 3star\" aria-label=\"7%\"><div class=\"a-meter-bar\" style=\"width: 7%;\"></div></div></a></td><td aria-hidden=\"true\" class=\"a-text-right aok-nowrap\"><a class=\"a-size-base a-link-normal 3star histogram-review-count\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_3?ie=UTF8&amp;filterByStar=three_star&amp;reviewerType=all_reviews#reviews-filter-bar\">7%</a><span class=\"a-letter-space\"></span></td></tr><tr data-reftag=\"cm_cr_srp_d_hist_2\" data-reviews-state-param=\"{&quot;filterByStar&quot;:&quot;two_star&quot;,&quot;pageNumber&quot;:&quot;1&quot;}\" class=\"a-histogram-row\"><td class=\"aok-nowrap\"><a aria-label=\"2 star (3%)\" class=\"a-size-base a-link-normal 2star\" title=\"2 star\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_2?ie=UTF8&amp;filterByStar=two_star&amp;reviewerType=all_reviews#reviews-filter-bar\">2 star</a><span class=\"a-letter-space\"></span></td><td aria-hidden=\"true\" class=\"a-span10\"><a class=\"a-size-base a-link-normal\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_2?ie=UTF8&amp;filterByStar=two_star&amp;reviewerType=all_reviews#reviews-filter-bar\"><div class=\"a-meter 2star\" aria-label=\"3%\"><div class=\"a-meter-bar\" style=\"width: 3%;\"></div></div></a></td><td aria-hidden=\"true\" class=\"a-text-right aok-nowrap\"><a class=\"a-size-base a-link-normal 2star histogram-review-count\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_2?ie=UTF8&amp;filterByStar=two_star&amp;reviewerType=all_reviews#reviews-filter-bar\">3%</a><span class=\"a-letter-space\"></span></td></tr><tr data-reftag=\"cm_cr_srp_d_hist_1\" data-reviews-state-param=\"{&quot;filterByStar&quot;:&quot;one_star&quot;,&quot;pageNumber&quot;:&quot;1&quot;}\" class=\"a-histogram-row\"><td class=\"aok-nowrap\"><a aria-label=\"1 star (7%)\" class=\"a-size-base a-link-normal 1star\" title=\"1 star\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_1?ie=UTF8&amp;filterByStar=one_star&amp;reviewerType=all_reviews#reviews-filter-bar\">1 star</a><span class=\"a-letter-space\"></span></td><td aria-hidden=\"true\" class=\"a-span10\"><a class=\"a-size-base a-link-normal\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_1?ie=UTF8&amp;filterByStar=one_star&amp;reviewerType=all_reviews#reviews-filter-bar\"><div class=\"a-meter 1star\" aria-label=\"7%\"><div class=\"a-meter-bar\" style=\"width: 7%;\"></div></div></a></td><td aria-hidden=\"true\" class=\"a-text-right aok-nowrap\"><a class=\"a-size-base a-link-normal 1star histogram-review-count\" tabindex=\"-1\" href=\"/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/ref=cm_cr_srp_d_hist_1?ie=UTF8&amp;filterByStar=one_star&amp;reviewerType=all_reviews#reviews-filter-bar\">7%</a><span class=\"a-letter-space\"></span></td></tr></table></span></div><script>\r\n" + 
				"            if (typeof uet == 'function') {\r\n" + 
				"              uet('cf', \"srpSummary\", {wb: 1});  \r\n" + 
				"            }\r\n" + 
				"          </script>\r\n" + 
				"\r\n" + 
				"          <div class=\"a-row a-spacing-base\"></div><script>\r\n" + 
				"            if (typeof uex == 'function') {\r\n" + 
				"              uex('ld', \"srpSummary\", {wb: 1});  \r\n" + 
				"            }\r\n" + 
				"          </script>\r\n" + 
				"\r\n" + 
				"        </div></div></div></div>\r\n" + 
				"\r\n" + 
				"<c:if test=\"true\">\r\n" + 
				"    <!-- btf pilu -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<style>\r\n" + 
				"  #nav-prime-tooltip{\r\n" + 
				"    padding: 0 20px 2px 20px;\r\n" + 
				"    background-color: white;\r\n" + 
				"    font-family: arial,sans-serif;\r\n" + 
				"  }\r\n" + 
				"  .nav-npt-text-title{\r\n" + 
				"    font-family: arial,sans-serif;\r\n" + 
				"    font-size: 18px;\r\n" + 
				"    font-weight: bold;\r\n" + 
				"    line-height: 21px;\r\n" + 
				"    color: #E47923;\r\n" + 
				"  }\r\n" + 
				"  .nav-npt-text-detail, a.nav-npt-a{\r\n" + 
				"    font-family: arial,sans-serif;\r\n" + 
				"    font-size: 12px;\r\n" + 
				"    line-height: 14px;\r\n" + 
				"    color: #333333;\r\n" + 
				"    margin: 2px 0px;\r\n" + 
				"  }\r\n" + 
				"  a.nav-npt-a {\r\n" + 
				"    text-decoration: underline;\r\n" + 
				"  }\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"<div  style=\"display: none\">\r\n" + 
				"  <div id=\"nav-prime-tooltip\">\r\n" + 
				"    <div class=\"nav-npt-text-title\"> Unlimited FREE fast delivery, video streaming &amp; more </div>\r\n" + 
				"    <div class=\"nav-npt-text-detail\"> Prime members enjoy unlimited free, fast delivery on eligible items, video streaming, ad-free music, exclusive access to deals &amp; more. </div>\r\n" + 
				"    <div class=\"nav-npt-text-detail\">\r\n" + 
				"      &gt;\r\n" + 
				"      <a class=\"nav-npt-a\" href=\"/gp/prime/ref=nav_tooltip_redirect/259-2484040-1898032\">Get started</a>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div style=\"display: none\">\r\n" + 
				"  <div id=\"nav-prime-menu\" class=\"nav-empty nav-flyout-content nav-ajax-prime-menu\">\r\n" + 
				"    <div class=\"nav_dynamic\"></div>\r\n" + 
				"    <div class=\"nav-ajax-message\"></div>\r\n" + 
				"    <div class=\"nav-ajax-error-msg\">\r\n" + 
				"      <p class=\"nav_p nav-bold\"></p>\r\n" + 
				"      <p class=\"nav_p\"><a href=\"/gp/prime/ref=nav_prime_ajax_err/259-2484040-1898032\" class=\"nav_a\"></a></p>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"  window.$Nav && $Nav.when(\"data\").run(function(data) { data({\"GiftCardsPanel\":{\"promoID\":\"nav-sa-gift-cards\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Gift Cards & Mobile Recharges\",\"items\":[{\"text\":\"Gift Cards\",\"items\":[{\"text\":\" All Gift Cards\",\"url\":\"/gift-card-store/b/ref=nav_shopall_sbc_gc_all?ie=UTF8&node=3704982031\"},{\"text\":\"Popular Gift Cards\",\"url\":\"/b/ref=nav_shopall_sbc_gc_popular?ie=UTF8&node=5807230031\"},{\"text\":\"Gift Boxes, Gift Tags, Greeting Cards\",\"url\":\"/b/ref=nav_shopall_sbc_gc_giftboxes?ie=UTF8&node=10595820031\"},{\"text\":\"Popular Brand Gift Vouchers \",\"url\":\"/b/ref=nav_shopall_sbc_gc_brands?ie=UTF8&node=6681889031\"},{\"text\":\"Birthday Gift Cards\",\"url\":\"/Birthday-Gift-Cards/b/ref=nav_shopall_sbc_gc_bday?ie=UTF8&node=4489193031\"},{\"text\":\"Wedding & Anniversary \",\"url\":\"/Wedding-Engagement-Gift-Cards/b/ref=nav_shopall_sbc_gc_wedding?ie=UTF8&node=4489235031\"},{\"text\":\"Best Wishes & Thank You\",\"url\":\"/Thank-You-Appreciation-Gift-Cards/b/ref=nav_shopall_sbc_gc_bestwishes?ie=UTF8&node=4489232031\"},{\"text\":\"Corporate Gift Cards\",\"url\":\"/Business-Gift-Cards-Vouchers/b/ref=nav_shopall_sbc_gc_corp?ie=UTF8&node=5620879031\"},{\"text\":\"Add a gift card\",\"url\":\"/gp/css/gc/payment/view-gc-balance/ref=nav_shopall_sbc_gc_add\"}]},{\"text\":\"Recharges\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Mobile Recharges\",\"url\":\"/b/ref=nav_shopall_pc_sbd_gc_recharge?ie=UTF8&node=14074947031\"}]}]}}},\"shopAllContent\":{\"template\":{\"name\":\"itemList\",\"data\":{\"items\":[{\"text\":\"Echo & Alexa\",\"panelKey\":\"EchoPanel\"},{\"text\":\"Fire TV Stick\",\"panelKey\":\"FireTVPanel\"},{\"text\":\"Kindle E-Readers & eBooks\",\"panelKey\":\"KindlePanel\"},{\"text\":\"Amazon Prime Video\",\"panelKey\":\"PrimeVideoPanel\"},{\"text\":\"Amazon Prime Music\",\"panelKey\":\"PrimeMusicPanel\"},{\"text\":\"Mobiles, Computers\",\"dividerBefore\":\"1\",\"panelKey\":\"PhonesAccessoriesPanel\"},{\"text\":\"TV, Appliances, Electronics\",\"panelKey\":\"TvApplElecPanel\"},{\"text\":\"Men's Fashion\",\"panelKey\":\"MensFashionPanel\"},{\"text\":\"Women's Fashion\",\"panelKey\":\"WomensFashionPanel\"},{\"text\":\"Home, Kitchen, Pets\",\"panelKey\":\"HomeKitchenPanel\"},{\"text\":\"Beauty, Health, Grocery\",\"panelKey\":\"BeautyHpcPanel\"},{\"text\":\"Sports, Fitness, Bags, Luggage\",\"panelKey\":\"SportsOutdoorsPanel\"},{\"text\":\"Toys, Baby Products, Kids' Fashion\",\"panelKey\":\"ToysBabyPanel\"},{\"text\":\"Car, Motorbike, Industrial\",\"panelKey\":\"AutomotivePanel\"},{\"text\":\"Books\",\"panelKey\":\"BooksPanel\"},{\"text\":\"Movies, Music & Video Games\",\"panelKey\":\"MusicMoviesGamesPanel\"},{\"text\":\"Gift Cards & Mobile Recharges\",\"panelKey\":\"GiftCardsPanel\"},{\"text\":\"Global Store\",\"panelKey\":\"GlobalStorePanel\"},{\"text\":\"Full Store Directory\",\"decorate\":\"carat\",\"url\":\"/gp/site-directory/ref=nav_shopall_sbc_fullstore\",\"dividerBefore\":\"1\"}]}}},\"EchoPanel\":{\"promoID\":\"nav-sa-Echo\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Echo & Alexa\",\"items\":[{\"text\":\"Echo & Alexa\",\"items\":[{\"subtext\":\"Smart speaker with Alexa\",\"text\":\"All-new Echo Dot\",\"url\":\"/dp/B0792KTHKK/ref=nav_shopall_shopall_donut\"},{\"subtext\":\"Always ready, connected & fast. Just ask\",\"text\":\"Amazon Echo\",\"url\":\"/dp/B0725W7Q38/ref=nav_shopall_shopall_radar\"},{\"subtext\":\"Stylish new Echo with a screen\",\"text\":\"Echo Spot\",\"url\":\"/dp/B01J6A7FGQ/ref=nav_shopall_shopall_Spot\"},{\"subtext\":\"Premium sound with built-in smart home hub\",\"text\":\"All-new Echo Plus\",\"url\":\"/dp/B0794JD9JS/ref=nav_shopall_shopall_lidar\"},{\"subtext\":\"Powerful subwoofer for your Echo\",\"text\":\"Introducing Echo Sub\",\"url\":\"/dp/B07F3NJJMG/ref=nav_shopall_shopall_pablo\"},{\"subtext\":\"Compare devices, learn about Alexa and more\",\"text\":\"See all devices with Alexa\",\"url\":\"/b/ref=nav_shopall_shopall_catpage?ie=UTF8&node=14156834031\"}]},{\"text\":\"Content & Resources\",\"columnBreak\":\"1\",\"items\":[{\"subtext\":\"Learn more about what you can do with Echo\",\"text\":\"Meet Alexa\",\"url\":\"/b/ref=nav_shopall_shopall_meetalexa?ie=UTF8&node=14172468031\"},{\"subtext\":\"Discover the power of your voice\",\"text\":\"Alexa Skills\",\"url\":\"/alexa-skills/b/ref=nav_shopall_shopall_a2s_help?ie=UTF8&node=11928183031\"},{\"subtext\":\"For Android, iOS and desktop browsers\",\"text\":\"Alexa App\",\"url\":\"/gp/help/customer/display.html/ref=nav_shopall_shopall_alexa_app?ie=UTF8&nodeId=201549920\"},{\"subtext\":\"Control smart home devices with Echo\",\"text\":\"Alexa Smart Home\",\"url\":\"/b/ref=nav_shopall_shopall_echo_smarthome?ie=UTF8&node=14095180031\"},{\"subtext\":\"Stream millions of songs, ad-free\",\"text\":\"Amazon Prime Music\",\"url\":\"http://www.amazon.in/music/prime?ref=dmm_in_nav_pc_alexa_mlp\"}]}]}}},\"signinContent\":{\"html\":\"<div id='nav-signin-tooltip'><a href='/gp/navigation/redirector.html/ref=sign-in-redirect?ie=UTF8&amp;associationHandle=inflex&amp;currentPageURL=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_signin&amp;pageType=&amp;switchAccount=&amp;yshURL=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_signin' class='nav-action-button' data-nav-role='signin' data-nav-ref='nav_custrec_signin'><span class='nav-action-inner'>Sign in</span></a><div class='nav-signin-tooltip-footer'>New customer? <a href='https://www.amazon.in/ap/register?_encoding=UTF8&amp;openid.assoc_handle=inflex&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.mode=checkid_setup&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&amp;openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&amp;openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_newcust' class='nav-a'>Start here.</a></div></div>\"},\"WomensFashionPanel\":{\"promoID\":\"nav-sa-womens-fashion\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Women's Fashion\",\"items\":[{\"text\":\"Women's Clothing\",\"items\":[{\"text\":\"Clothing\",\"url\":\"/Womens-clothing/b/ref=nav_shopall_sbc_wfashion_clothing?ie=UTF8&node=1953602031\"},{\"text\":\"Western Wear\",\"url\":\"/womens-western-wear/b/ref=nav_shopall_sbc_wfashion_western?ie=UTF8&node=11400137031\"},{\"text\":\"Ethnic Wear\",\"url\":\"/womens-ethnic-wear/b/ref=nav_shopall_sbc_wfashion_ethnic?ie=UTF8&node=1968253031\"},{\"text\":\"Lingerie & Nightwear\",\"url\":\"/b/ref=nav_shopall_sbc_wfashion_lingerie?ie=UTF8&node=11400136031\"},{\"text\":\"Top Brands\",\"url\":\"/s/ref=nav_shopall_sbc_wfashion_topbrands?_encoding=UTF8&bbn=1953602031&lo=apparel&rh=i%3Aapparel%2Cn%3A1571271031%2Cn%3A%211571272031%2Cn%3A1953602031%2Ck%3A-sunglass%20-eye%2Cp_98%3A10440597031%2Cp_n_feature_nineteen_browse-bin%3A11301357031\"}]},{\"text\":\"Accessories\",\"items\":[{\"text\":\"Watches\",\"url\":\"/Women-Watches/b/ref=nav_shopall_sbc_wfashion_watches?ie=UTF8&node=2563505031\"},{\"text\":\"Handbags & Clutches\",\"url\":\"/Handbags-Clutches/b/ref=nav_shopall_sbc_wfashion_handbags?ie=UTF8&node=1983338031\"},{\"text\":\"Gold & Diamond Jewellery\",\"url\":\"/Precious-Jewellery/b/ref=nav_shopall_sbc_wfashion_jewelry?ie=UTF8&node=5210069031\"},{\"text\":\"Fashion & Silver Jewellery\",\"url\":\"/Fashion-Jewellery/b/ref=nav_shopall_sbc_wfashion_fashionjwl?ie=UTF8&node=5210079031\"},{\"text\":\"Sunglasses\",\"url\":\"/Sunglasses/b/ref=nav_shopall_sbc_wfashion_sunglasses?ie=UTF8&node=1968401031\"}]},{\"text\":\"Women's Shoes\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Shoes\",\"url\":\"/Women-Shoes/b/ref=nav_shopall_sbc_wfashion_shoes?ie=UTF8&node=1983578031\"},{\"text\":\"Fashion Sandals\",\"url\":\"/Fashion-Sandals-Women/b/ref=nav_shopall_sbc_wfashion_sandals?ie=UTF8&node=1983633031\"},{\"text\":\"Ballerinas\",\"url\":\"/Ballet-Flats/b/ref=nav_shopall_sbc_wfashion_ballerina?ie=UTF8&node=1983627031\"}]},{\"text\":\"Stores\",\"items\":[{\"text\":\"The Designer Boutique\",\"url\":\"/b/ref=nav_shopall_sbc_wfashion_designerstore?ie=UTF8&node=6172354031\"},{\"text\":\"Handloom & Handicraft Store\",\"url\":\"/handloom-and-handcrafts-store/b/ref=nav_shopall_sbc_wfashion_handloomstore?ie=UTF8&node=11971792031\"},{\"text\":\"Sportswear\",\"url\":\"/b/ref=nav_shopall_sbc_wfashion_sportswear?ie=UTF8&node=12302884031\"},{\"text\":\"Women's Fashion\",\"url\":\"/b/ref=nav_shopall_sbc_wfashion_all?ie=UTF8&node=7459780031\"},{\"text\":\"Amazon Fashion\",\"url\":\"/b/ref=nav_shopall_sbc_wfashion_af?ie=UTF8&node=6648217031\"},{\"text\":\"Fashion Sales & Deals\",\"url\":\"/End-of-season-sale-Clothing/b/ref=nav_shopall_sbc_wfashion_sales_deals?ie=UTF8&node=4188827031\"}]}]}}},\"MensFashionPanel\":{\"promoID\":\"nav-sa-mens-fashion\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Men's Fashion\",\"items\":[{\"text\":\"Men's Clothing\",\"items\":[{\"text\":\"Clothing\",\"url\":\"/Mens-Clothing/b/ref=nav_shopall_sbc_mfashion_clothing?ie=UTF8&node=1968024031\"},{\"text\":\"T-shirts & Polos\",\"url\":\"/Mens-Tshirts-Polos/b/ref=nav_shopall_sbc_mfashion_tshirts?ie=UTF8&node=1968120031\"},{\"text\":\"Shirts\",\"url\":\"/Mens-Shirts/b/ref=nav_shopall_sbc_mfashion_shirts?ie=UTF8&node=1968093031\"},{\"text\":\"Jeans\",\"url\":\"/Mens-Jeans/b/ref=nav_shopall_sbc_mfashion_jeans?ie=UTF8&node=1968076031\"},{\"text\":\"Innerwear\",\"url\":\"/Mens-Inner-wear/b/ref=nav_shopall_sbc_mfashion_innerwear?ie=UTF8&node=1968126031\"}]},{\"text\":\"Accessories\",\"items\":[{\"text\":\"Watches\",\"url\":\"/Men-Watches/b/ref=nav_shopall_sbc_mfashion_watches?ie=UTF8&node=2563504031\"},{\"text\":\"Bags & Luggage\",\"url\":\"/Luggage-Bags/b/ref=nav_shopall_sbc_mfashion_bags?ie=UTF8&node=2454169031\"},{\"text\":\"Sunglasses\",\"url\":\"/Sunglasses/b/ref=nav_shopall_sbc_mfashion_sunglasses?ie=UTF8&node=1968036031\"},{\"text\":\"Jewellery\",\"url\":\"/Mens-Jewellery/b/ref=nav_shopall_sbc_mfashion_jewelry?ie=UTF8&node=7124359031\"},{\"text\":\"Wallets\",\"url\":\"/wallets-for-men/b/ref=nav_shopall_sbc_mfashion_wallets?ie=UTF8&node=2917496031\"}]},{\"text\":\"Men's Shoes\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Shoes\",\"url\":\"/Men-Shoes/b/ref=nav_shopall_sbc_mfashion_shoes?ie=UTF8&node=1983518031\"},{\"text\":\"Sports Shoes\",\"url\":\"/mens-sports-shoes/b/ref=nav_shopall_sbc_mfashion_sportshoes?ie=UTF8&node=1983519031\"},{\"text\":\"Formal Shoes\",\"url\":\"/Men-Formal-Shoes/b/ref=nav_shopall_sbc_mfashion_formalshoes?ie=UTF8&node=1983572031\"},{\"text\":\"Casual Shoes\",\"url\":\"/Mens-Casual-Shoes/b/ref=nav_shopall_sbc_mfashion_casualshoes?ie=UTF8&node=9780814031\"}]},{\"text\":\"Stores\",\"items\":[{\"text\":\"Sportswear\",\"url\":\"/b/ref=nav_shopall_sbc_mfashion_sportswear?ie=UTF8&node=12456568031\"},{\"text\":\"The Designer Boutique\",\"url\":\"/b/ref=nav_shopall_sbc_mfashion_designerstore?ie=UTF8&node=6172354031\"},{\"text\":\"Men's Fashion\",\"url\":\"/b/ref=nav_shopall_sbc_mfashion_all?ie=UTF8&node=7459781031\"},{\"text\":\"Amazon Fashion\",\"url\":\"/b/ref=nav_shopall_sbc_mfashion_af?ie=UTF8&node=6648217031\"},{\"text\":\"Fashion Sales & Deals\",\"url\":\"/End-of-season-sale-Clothing/b/ref=nav_shopall_sbc_mfashion_sales_deals?ie=UTF8&node=4188827031\"}]}]}}},\"GlobalStorePanel\":{\"promoID\":\"nav-sa-global-store\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Global Store\",\"items\":[{\"text\":\"Global Store\",\"items\":[{\"text\":\"Clothing & Accessories\",\"url\":\"/imported-clothes/b/ref=nav_shopall_sbc_ags_clothing?ie=UTF8&node=11132088031\"},{\"text\":\"Watches\",\"url\":\"/imported-watches/b/ref=nav_shopall_sbc_ags_watches?ie=UTF8&node=11132087031\"},{\"text\":\"Home & Kitchen\",\"url\":\"/imported-home-and-kitchen-products/b/ref=nav_shopall_sbc_ags_hk?ie=UTF8&node=11132092031\"},{\"text\":\"Shoes\",\"url\":\"/b/ref=nav_shopall_sbc_ags_shoes?ie=UTF8&node=11132085031\"},{\"text\":\"PC & Electronics\",\"url\":\"/imported-electronics/b/ref=nav_shopall_sbc_ags_electronics?ie=UTF8&node=11364067031\"},{\"text\":\"Office Supplies\",\"url\":\"/imported-office-supplies/b/ref=nav_shopall_sbc_ags_office?ie=UTF8&node=11302617031\"},{\"text\":\"Toys & Games\",\"url\":\"/b/ref=nav_shopall_sbc_ags_toys?ie=UTF8&node=13466813031\"},{\"text\":\"Pet Supplies\",\"url\":\"/b/ref=nav_shopall_sbc_ags_Pets?ie=UTF8&node=13352491031\"},{\"text\":\"Luggage\",\"url\":\"/b/ref=nav_shopall_sbc_ags_Luggage?ie=UTF8&node=13352493031\"},{\"text\":\"Musical Instruments\",\"url\":\"/b/ref=nav_shopall_sbc_ags_MI?ie=UTF8&node=13352490031\"},{\"text\":\"Sports & Fitness\",\"url\":\"/imported-sports-and-fitness-equipments/b/ref=nav_shopall_sbc_ags_sports?ie=UTF8&node=11132091031\"},{\"text\":\"Music\",\"url\":\"/b/ref=nav_shopall_sbc_ags_music?ie=UTF8&node=13146826031\"},{\"text\":\"Video Games\",\"url\":\"/b/ref=nav_shopall_sbc_ags_VG?ie=UTF8&node=13144381031\"},{\"text\":\"Books\",\"url\":\"/international-books-store/b/ref=nav_shopall_sbc_ags_books?ie=UTF8&node=11132090031\"},{\"text\":\"Global Store\",\"url\":\"/imported-goods/b/ref=nav_shopall_sbc_ags_all?ie=UTF8&node=10998136031\"}]},{\"text\":\"Stores\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Bestsellers\",\"url\":\"/b/ref=nav_shopall_sbc_ags_BS?ie=UTF8&node=12710045031\"},{\"text\":\"Women's Fashion\",\"url\":\"/imported-fashion-goods-for-women/b/ref=nav_shopall_sbc_ags_WF?ie=UTF8&node=11132094031\"},{\"text\":\"Men's Fashion\",\"url\":\"/imported-goods-for-men/b/ref=nav_shopall_sbc_ags_MF?ie=UTF8&node=11132093031\"},{\"text\":\"Shop by Room\",\"url\":\"/b/ref=nav_shopall_sbc_ags_SBR?ie=UTF8&node=12257497031\"}]}]}}},\"KindlePanel\":{\"promoID\":\"nav-sa-kindle\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Kindle E-Readers & eBooks\",\"items\":[{\"text\":\"Kindle E-readers\",\"items\":[{\"text\":\"Kindle\",\"url\":\"/dp/B0186FF45G/ref=nav_shopall_sbc_k_KiNew\"},{\"text\":\"All-new Kindle Paperwhite\",\"url\":\"/dp/B077454Z99/ref=nav_shopall_sbc_k_kms\"},{\"text\":\"Kindle Paperwhite Starter Pack\",\"url\":\"/dp/B07C9L72VC/ref=nav_shopall_sbc_k_kms_ksp\"},{\"text\":\"Kindle Voyage\",\"url\":\"/dp/B00IOY5AS6/ref=nav_shopall_sbc_k_kp_ki\"},{\"text\":\"All Certified Refurbished\",\"url\":\"/b/ref=nav_shopall_sbc_k_refub?ie=UTF8&node=15606832031\"},{\"subtext\":\"Covers, chargers, sleeves and more\",\"text\":\"Kindle E-Reader Accessories\",\"url\":\"/Kindle-Accessories/b/ref=nav_shopall_sbc_k_kacce?ie=UTF8&node=1634751031\"},{\"text\":\"See all Kindle E-readers\",\"url\":\"/Kindle-eReader-Store/b/ref=nav_shopall_sbc_k_allk?ie=UTF8&node=9840097031\"}]},{\"dividerBefore\":\"1\",\"items\":[{\"text\":\"Free Kindle Reading Apps\",\"url\":\"/kindle-dbs/fd/kcp/ref=nav_shopall_sbc_kapp\"},{\"text\":\"Kindle Cloud Reader\",\"url\":\"https://www.amazon.in:443/gp/redirect.html/ref=nav_shopall_sbc_kcr?location=https://read.amazon.in/&token=88744B5D578CF36B8995B972051BF801BD73A5B2&source=standards\",\"extra\":\"target=\\\"_blank\\\"\"},{\"text\":\"Manage Your Content and Devices\",\"url\":\"/gp/digital/fiona/manage/ref=nav_shopall_sbc_myk\"}]},{\"text\":\"Kindle eBooks\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"All Kindle eBooks\",\"url\":\"/ebooks-kindle/b/ref=nav_shopall_sbc_kdl_ebkall?ie=UTF8&node=1634753031\"},{\"text\":\"NEW! Prime Reading\",\"url\":\"/kindle-dbs/hz/bookshelf/prime/ref=nav_shopall_sbc_pr_eng_rw_gno\"},{\"subtext\":\"With a free 30-day trial\",\"text\":\"Kindle Unlimited\",\"url\":\"/b/ref=nav_shopall_sbc_kdl_ku?ie=UTF8&node=6969155031\"},{\"text\":\"Kindle Exam Central\",\"url\":\"/b/ref=nav_shopall_sbc_gno_KEC?ie=UTF8&node=1637249031\"},{\"text\":\"Kindle eTextbooks\",\"url\":\"/b/ref=nav_shopall_sbc_gno_etext?ie=UTF8&node=15358196031\"},{\"text\":\"Kindle Monthly Deals\",\"url\":\"/b/ref=nav_shopall_sbc_gno_kmd?ie=UTF8&node=6612085031\"},{\"text\":\"eBook Bestsellers\",\"url\":\"/gp/bestsellers/digital-text/1634753031/ref=nav_shopall_sbc_kdl_ebkbest\"},{\"text\":\"eBooks in Indian Languages\",\"url\":\"/indian-language-ebooks/b/ref=nav_shopall_sbc_ebooks_indic?ie=UTF8&node=10837926031\",\"dividerBefore\":\"1\"},{\"text\":\"Hindi\",\"url\":\"/hindi-ebooks/b/ref=nav_shopall_sbc_ebk_hindi?ie=UTF8&node=10837927031\"},{\"text\":\"Tamil\",\"url\":\"/tamil-ebooks/b/ref=nav_shopall_sbc_ebk_tamil?ie=UTF8&node=10837929031\"}]}]}}},\"MusicMoviesGamesPanel\":{\"promoID\":\"nav-sa-music-movies-games\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Movies, Music & Video Games\",\"items\":[{\"text\":\" Movies & TV Shows\",\"items\":[{\"text\":\"All Movies & TV Shows\",\"url\":\"/movies-tv-shows/b/ref=nav_shopall_sbc_mmvg_movies_all?ie=UTF8&node=976416031\"},{\"text\":\"Blu-ray\",\"url\":\"/blu-ray/b/ref=nav_shopall_sbc_mmvg_movies_bluray?ie=UTF8&node=1575405031\"},{\"text\":\"All English\",\"url\":\"/Hindi-Movies-TV-Shows/b/ref=nav_shopall_sbc_mmvg_movies_eng?ie=UTF8&node=4068583031\"},{\"text\":\"All Hindi\",\"url\":\"/English-Movies-TV-Shows/b/ref=nav_shopall_sbc_mmvg_movies_hindi?ie=UTF8&node=4068584031\"}]},{\"text\":\"Video Games\",\"dividerBefore\":\"1\",\"items\":[{\"text\":\"Gaming Consoles\",\"url\":\"/Video-Games-Consoles/b/ref=nav_shopall_sbc_mmvg_consoles?ie=UTF8&node=4092115031\"},{\"text\":\"Latest Video Games\",\"url\":\"/Video-Games-New-Releases/b/ref=nav_shopall_sbc_mmvg_latestvg?ie=UTF8&node=4069183031\"},{\"text\":\"Gaming Accessories\",\"url\":\"/Video-Games-Accessories/b/ref=nav_shopall_sbc_mmvg_vgaccessories?ie=UTF8&node=4092116031\"},{\"text\":\" PC Games \",\"url\":\"/pc-games/b/ref=nav_shopall_sbc_mmvg_pcgames?ie=UTF8&node=1376518031\"},{\"text\":\"Video Games Deals\",\"url\":\"/Deals-on-Software/b/ref=nav_shopall_sbc_mmvg_vgdeals?ie=UTF8&node=4238594031\"},{\"text\":\"All Video Games\",\"url\":\"/video-games/b/ref=nav_shopall_sbc_mmvg_allvg?ie=UTF8&node=976460031\"}]},{\"text\":\"Music\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"All Music\",\"url\":\"/music/b/ref=nav_shopall_sbc_mmvg_music_all?ie=UTF8&node=976445031\"},{\"text\":\"International Music\",\"url\":\"/International-Music/b/ref=nav_shopall_sbc_mmvg_music_intl?ie=UTF8&node=4092674031\"},{\"text\":\"Film Songs\",\"url\":\"/Film-Songs/b/ref=nav_shopall_sbc_mmvg_music_films?ie=UTF8&node=1375845031\"},{\"text\":\"Indian Classical\",\"url\":\"/Indian-Classical/b/ref=nav_shopall_sbc_mmvg_music_classical?ie=UTF8&node=1375848031\"},{\"text\":\"Musical Instruments & Professional Audio\",\"url\":\"/Musical-Instruments/b/ref=nav_shopall_sbc_mmvg_musical_inst?ie=UTF8&node=3677697031\"}]},{\"text\":\"Stream Music\",\"dividerBefore\":\"1\",\"items\":[{\"text\":\"Open web player\",\"url\":\"https://music.amazon.in/home?ref=dmm_in_nav_pc_mu_webplayer\"},{\"subtext\":\"Stream millions of songs, ad-free\",\"text\":\"Amazon Prime Music\",\"url\":\"http://www.amazon.in/music/prime?ref=dmm_in_nav_pc_mu_mlp\"}]}]}}},\"BeautyHpcPanel\":{\"promoID\":\"nav-sa-beauty-hpc\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Beauty, Health, Grocery\",\"items\":[{\"text\":\"Beauty & Health\",\"items\":[{\"text\":\"Beauty & Grooming\",\"url\":\"/beauty/b/ref=nav_shopall_sbc_bhg_beauty_all?ie=UTF8&node=1355016031\"},{\"text\":\"Luxury Beauty\",\"url\":\"/b/ref=nav_shopall_sbc_bhg_lux?ie=UTF8&node=5311359031\"},{\"text\":\"Make-up\",\"url\":\"/Makeup-Nails/b/ref=nav_shopall_sbc_bhg_makeup?ie=UTF8&node=1374357031\"},{\"text\":\"Health & Personal Care\",\"url\":\"/health-and-personal-care/b/ref=nav_shopall_sbc_bhg_hpc?ie=UTF8&node=1350384031\",\"dividerBefore\":\"1\"},{\"text\":\"Household Supplies\",\"url\":\"/b/ref=nav_shopall_sbc_bhg_household?ie=UTF8&node=1374515031\"},{\"text\":\"Personal Care Appliances\",\"url\":\"/Personal-Care-Appliances/b/ref=nav_shopall_sbc_bhg_pca?ie=UTF8&node=3150028031\"},{\"text\":\" Diet & Nutrition\",\"url\":\"/Diet-Nutrition/b/ref=nav_shopall_sbc_bhg_dnn?ie=UTF8&node=1374489031\"},{\"text\":\"Subscribe & Save\",\"url\":\"/b/ref=nav_shopall_sbc_bhg_sns?ie=UTF8&node=5728645031\"},{\"text\":\"Amazon Pantry\",\"url\":\"/b/ref=nav_shopall_sbc_bhg_pantry?ie=UTF8&node=9574332031\"},{\"text\":\"Value Bazaar\",\"url\":\"/super-value-day-offers/b/ref=nav_shopall_sbc_bhg_valuebazaar?ie=UTF8&node=6802110031\"}]},{\"text\":\"Grocery & Gourmet Foods\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"All Grocery & Gourmet Foods\",\"url\":\"/Gourmet-Specialty-Foods/b/ref=nav_shopall_sbc_bhg_gourmet_all?ie=UTF8&node=2454178031\"},{\"text\":\"Coffee, Tea & Beverages\",\"url\":\"/Coffee-Tea-Beverages/b/ref=nav_shopall_sbc_bhg_beverages?ie=UTF8&node=4859478031\"},{\"text\":\"Snack Foods\",\"url\":\"/Snack-Foods/b/ref=nav_shopall_sbc_bhg_snacks?ie=UTF8&node=4859498031\"}]}]}}},\"AutomotivePanel\":{\"promoID\":\"nav-sa-automotive\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Car, Motorbike, Industrial\",\"items\":[{\"text\":\"Car & Motorbike\",\"items\":[{\"text\":\"Motorbike Accessories & Parts\",\"url\":\"/b/ref=nav_shopall_sbc_auto_bike_acc?ie=UTF8&node=5257478031\"},{\"text\":\"Car Accessories\",\"url\":\"/Car-Accessories/b/ref=nav_shopall_sbc_auto_caracc?ie=UTF8&node=5257474031\"},{\"text\":\"Car Electronics\",\"url\":\"/Car-Vehicle-Electronics/b/ref=nav_shopall_sbc_auto_carelec?ie=UTF8&node=1389221031\"},{\"text\":\"Car Parts\",\"url\":\"/Car-Parts/b/ref=nav_shopall_sbc_auto_carparts?ie=UTF8&node=5257475031\"},{\"text\":\"Car & Bike Care\",\"url\":\"/Car-n-Motorbike-Care/b/ref=nav_shopall_sbc_auto_care?ie=UTF8&node=5257472031\"},{\"text\":\"All Car & Motorbike Products\",\"url\":\"/Car-Motorbike-Store/b/ref=nav_shopall_sbc_auto_all?ie=UTF8&node=4772060031\"}]},{\"text\":\"Industrial Supplies\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Industrial & Scientific Supplies\",\"url\":\"/industrial-scientific/b/ref=nav_shopall_sbc_auto_ind_all?ie=UTF8&node=5866078031\"},{\"text\":\"Test, Measure & Inspect\",\"url\":\"/b/ref=nav_shopall_sbc_auto_ind_test?ie=UTF8&node=6395912031\"},{\"text\":\"Lab & Scientific\",\"url\":\"/b/ref=nav_shopall_sbc_auto_ind_lab?ie=UTF8&node=6409335031\"},{\"text\":\"Janitorial & Sanitation Supplies\",\"url\":\"/b/ref=nav_shopall_sbc_auto_ind_jansan?ie=UTF8&node=6563520031\"}]}]}}},\"wishlistContent\":{\"template\":{\"name\":\"itemList\",\"data\":{\"items\":[{\"text\":\"Create a Wish List\",\"url\":\"/gp/registry/wishlist/ref=nav_wishlist_gno_createwl?ie=UTF8&triggerElementID=createList\"},{\"text\":\"Find a Wish List\",\"url\":\"/gp/registry/search.html/ref=nav_wishlist_gno_listpop_find?ie=UTF8&type=wishlist\"},{\"subtext\":\"Add items to your List from anywhere\",\"text\":\"Wish from Any Website\",\"url\":\"/wishlist/universal/ref=nav_wishlist_gno_listpop_uwl\"},{\"text\":\"Baby Wish List\",\"url\":\"/baby-reg/homepage/ref=nav_wishlist_gno_listpop_br\"}]}}},\"ToysBabyPanel\":{\"promoID\":\"nav-sa-toys-baby\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Toys, Baby Products, Kids' Fashion\",\"items\":[{\"text\":\"Toys & Baby Products\",\"items\":[{\"text\":\"Toys & Games\",\"url\":\"/Toys-Games/b/ref=nav_shopall_sbc_tbk_toys_games?ie=UTF8&node=1350380031\"},{\"text\":\"Baby Products\",\"url\":\"/Baby/b/ref=nav_shopall_sbc_tbk_baby_products?ie=UTF8&node=1571274031\"},{\"text\":\"Diapers\",\"url\":\"/Diapering-Nappy-Changing/b/ref=nav_shopall_sbc_tbk_diapers?ie=UTF8&node=1953345031\"},{\"text\":\"Baby Wish List\",\"url\":\"/baby-reg/homepage/ref=nav_shopall_sbc_tbk_baby_registry\"},{\"text\":\"Toys Gifting Store\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_toysgiftstore?ie=UTF8&node=12187967031\"},{\"text\":\"STEM Toys Store\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_stemtoys?ie=UTF8&node=9783607031\"},{\"text\":\"International Toy Store\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_intltoys?ie=UTF8&node=8988918031\"},{\"text\":\"Baby Bath, Skin & Grooming\",\"url\":\"/Baby-Care/b/ref=nav_shopall_sbc_tbk_babybath?ie=UTF8&node=1953111031\"},{\"text\":\"Strollers & Prams\",\"url\":\"/Strollers-Prams/b/ref=nav_shopall_sbc_tbk_strollers?ie=UTF8&node=1953480031\"},{\"text\":\"Nursing & Feeding\",\"url\":\"/Nursing-Feeding/b/ref=nav_shopall_sbc_tbk_nursing?ie=UTF8&node=1953448031\"},{\"text\":\"Subscribe & Save\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_sns?ie=UTF8&node=5728645031\"},{\"text\":\"Amazon Pantry\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_pantry?ie=UTF8&node=9574332031\"},{\"subtext\":\"Prime members get 15% off diapers\",\"text\":\"Amazon Family\",\"url\":\"/gp/family/signup/ref=nav_shopall_family\"}]},{\"text\":\"Kids' Fashion\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Kids' Clothing\",\"url\":\"/kids-clothing/b/ref=nav_shopall_sbc_tbk_kids_clothing?ie=UTF8&node=4091091031\"},{\"text\":\"Kids' Shoes\",\"url\":\"/Kids-Baby-Shoes/b/ref=nav_shopall_sbc_tbk_kids_shoes?ie=UTF8&node=4091095031\"},{\"text\":\"School Bags\",\"url\":\"/School-Bags/b/ref=nav_shopall_sbc_tbk_school_bags?ie=UTF8&node=2917444031\"},{\"text\":\"Kids' Watches\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_kids_watches?ie=UTF8&node=8564835031\"},{\"text\":\"Kids' Fashion\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_kids_fashion?ie=UTF8&node=9361420031\"},{\"text\":\"Baby Fashion\",\"url\":\"/b/ref=nav_shopall_sbc_tbk_baby_fashion?ie=UTF8&node=11987349031\"}]}]}}},\"SportsOutdoorsPanel\":{\"promoID\":\"nav-sa-sports-outdoors\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Sports, Fitness, Bags, Luggage\",\"items\":[{\"text\":\"Sports & Fitness\",\"items\":[{\"text\":\"Cricket\",\"url\":\"/Cricket/b/ref=nav_shopall_sbc_sportslugg_cricket?ie=UTF8&node=3403628031\"},{\"text\":\"Badminton\",\"url\":\"/Badminton/b/ref=nav_shopall_sbc_sportslugg_badminton?ie=UTF8&node=3403619031\"},{\"text\":\"Cycling\",\"url\":\"/Cycling/b/ref=nav_shopall_sbc_sportslugg_cycling?ie=UTF8&node=3403629031\"},{\"text\":\"Football\",\"url\":\"/Football/b/ref=nav_shopall_sbc_sportslugg_football?ie=UTF8&node=3403640031\"},{\"text\":\"Running\",\"url\":\"/Running-Clothing-Accessories/b/ref=nav_shopall_sbc_sportslugg_running?ie=UTF8&node=3403659031\"},{\"text\":\"Camping & Hiking\",\"url\":\"/Camping-Hiking/b/ref=nav_shopall_sbc_sportslugg_camping?ie=UTF8&node=1984988031\"},{\"text\":\"Fitness Accessories\",\"url\":\"/Fitness-Accessories/b/ref=nav_shopall_sbc_sportslugg_fitness_acc?ie=UTF8&node=3403925031\"},{\"text\":\"Yoga\",\"url\":\"/Yoga-Accessories/b/ref=nav_shopall_sbc_sportslugg_yoga?ie=UTF8&node=3403935031\"},{\"text\":\"Strength Training\",\"url\":\"/Strength-Training/b/ref=nav_shopall_sbc_sportslugg_strength?ie=UTF8&node=3403933031\"},{\"text\":\"Cardio Equipment\",\"url\":\"/b/ref=nav_shopall_sbc_sportslugg_cardio?ie=UTF8&node=3403926031\"},{\"text\":\"Certified Refurbished\",\"url\":\"/b/ref=nav_shopall_sbc_sports_certfied_refurbished?ie=UTF8&node=15290772031\"},{\"text\":\"All Exercise & Fitness\",\"url\":\"/Exercise-Fitness/b/ref=nav_shopall_sbc_sportslugg_exercise?ie=UTF8&node=3403635031\"},{\"text\":\"All Sports, Fitness & Outdoors\",\"url\":\"/Sports/b/ref=nav_shopall_sbc_sportslugg_all_sports?ie=UTF8&node=1984443031\"}]},{\"text\":\"Bags & Luggage\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Backpacks\",\"url\":\"/Backpacks/b/ref=nav_shopall_sbc_sportslugg_backpacks?ie=UTF8&node=2917430031\"},{\"text\":\"Rucksacks\",\"url\":\"/b/ref=nav_shopall_sbc_sportslugg_rucksacks?ie=UTF8&node=1984997031\"},{\"text\":\"Suitcases & Trolley Bags\",\"url\":\"/Suitcases/b/ref=nav_shopall_sbc_sportslugg_checkinbags?ie=UTF8&node=2917450031\"},{\"text\":\"Travel Duffles\",\"url\":\"/Travel-Duffles/b/ref=nav_shopall_sbc_sportslugg_duffles?ie=UTF8&node=2917451031\"},{\"text\":\"Travel Accessories\",\"url\":\"/Travel-Accessories/b/ref=nav_shopall_sbc_sportslugg_travelacc?ie=UTF8&node=2917434031\"},{\"text\":\"Wallets\",\"url\":\"/Wallets/b/ref=nav_shopall_sbc_sportslugg_wallets?ie=UTF8&node=2917484031\"}]}]}}},\"FireTVPanel\":{\"promoID\":\"nav-sa-Fire-TV\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Fire TV Stick\",\"items\":[{\"subtext\":\"Stream thousands of TV Shows & Movies\",\"text\":\"Fire TV Stick\",\"url\":\"/dp/B01EU2M62S/ref=nav_shopall_shopall_tank\"},{\"subtext\":\"Brilliant picture. Powerful performance.\",\"text\":\"All-New Fire TV Stick 4K\",\"url\":\"/dp/B079QQZZJK/ref=nav_shopall_shopall_mantis\"},{\"subtext\":\"Movies, TV shows and Amazon Originals\",\"text\":\"Amazon Prime Video\",\"url\":\"/b/ref=nav_shopall_shopall_Primevideo?_encoding=UTF8&node=10882806031\"},{\"subtext\":\"Featured Fire TV Apps & Games\",\"text\":\"Fire TV Apps & Games\",\"url\":\"/b/ref=nav_shopall_shopall_tankapps?_encoding=UTF8&node=1661666031\"},{\"text\":\"See all Fire TV devices\",\"url\":\"/b/ref=nav_shopall_shopall_catpage?ie=UTF8&node=12805339031\"}]}}},\"PrimeVideoPanel\":{\"promoID\":\"nav-sa-prime-video\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Amazon Prime Video\",\"items\":[{\"subtext\":\"Movies, TV shows and Amazon Originals\",\"text\":\"All Videos\",\"url\":\"/b/ref=nav_shopall_shopall_Primevideo?_encoding=UTF8&node=10882806031#great\"},{\"subtext\":\"Latest India and US blockbusters\",\"text\":\"Movies\",\"url\":\"/b/ref=nav_shopall_shopall_Primevideo?_encoding=UTF8&node=10882806031#movies\"},{\"subtext\":\"Popular shows and series\",\"text\":\"TV Shows\",\"url\":\"/b/ref=nav_shopall_shopall_Primevideo?_encoding=UTF8&node=10882806031#tvshows\"},{\"text\":\"Kids Shows\",\"url\":\"/b/ref=nav_shopall_shopall_Primevideo?_encoding=UTF8&node=10882806031#kids\"}]}}},\"yourAccountContent\":{\"template\":{\"name\":\"itemList\",\"data\":{\"items\":[{\"text\":\"Your Account\",\"url\":\"/gp/css/homepage.html/ref=nav_youraccount_ya\"},{\"text\":\"Your Orders\",\"url\":\"/gp/css/order-history/ref=nav_youraccount_orders\",\"id\":\"nav_prefetch_yourorders\"},{\"text\":\"Your Wish List\",\"url\":\"/gp/registry/wishlist/ref=nav_youraccount_wl?ie=UTF8&requiresSignIn=1\"},{\"text\":\"Your Recommendations\",\"url\":\"/gp/yourstore/ref=nav_youraccount_recs\"},{\"text\":\"Your Prime Membership\",\"url\":\"/gp/primecentral/ref=nav_youraccount_prime\"},{\"text\":\"Your Prime Video\",\"url\":\"/b/ref=nav_youraccount_dvm_crs_gat_in_tn_yraccount?_encoding=UTF8&node=10882806031\"},{\"text\":\"Your Subscribe & Save Items\",\"url\":\"/gp/subscribe-and-save/manage/ref=nav_youraccount_sns\"},{\"text\":\"Your Amazon Business Account\",\"url\":\"/business?_encoding=UTF8&node=11476704031&ref_=nav_ya_flyout_b2b_reg\"},{\"text\":\"Your Seller Account\",\"url\":\"/p2p/ref=nav_youraccount_sell\"},{\"text\":\"Manage Your Content and Devices\",\"url\":\"/gp/digital/fiona/manage/ref=nav_youraccount_myk\",\"dividerBefore\":\"1\"},{\"dividerBefore\":\"1\"},{\"text\":\"Switch Accounts\",\"url\":\"/gp/navigation/redirector.html/ref=sign-in-redirect?ie=UTF8&associationHandle=inflex&currentPageURL=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_youraccount_switchacct&pageType=&switchAccount=picker&yshURL=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_youraccount_switchacct\",\"id\":\"nav-item-switch-account\"},{\"text\":\"Sign Out\",\"url\":\"/gp/flex/sign-out.html/ref=nav_youraccount_signout?ie=UTF8&action=sign-out&path=%2Fgp%2Fyourstore%2Fhome&signIn=1&useRedirectOnSuccess=1\",\"id\":\"nav-item-signout\"}]}},\"wlTriggers\":\"85042\"},\"BooksPanel\":{\"promoID\":\"nav-sa-books\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Books\",\"items\":[{\"text\":\"Books\",\"items\":[{\"text\":\"All Books\",\"url\":\"/Books/b/ref=nav_shopall_sbc_books_all?ie=UTF8&node=976389031\"},{\"text\":\"Fiction Books\",\"url\":\"/literature-fiction-books/b/ref=nav_shopall_sbc_books_fiction?ie=UTF8&node=1318157031\"},{\"text\":\"Editor's Corner\",\"url\":\"/b/ref=nav_shopall_sbc_books_editorscorner?ie=UTF8&node=10591963031\"},{\"text\":\"School Textbooks\",\"url\":\"/School-Books/b/ref=nav_shopall_sbc_books_schooltexts?ie=UTF8&node=4149807031\"},{\"text\":\"Children's Books\",\"url\":\"/children-books/b/ref=nav_shopall_sbc_books_children?ie=UTF8&node=1318073031\"},{\"text\":\"Exam Central\",\"url\":\"/Exam-Preparations-Books/b/ref=nav_shopall_sbc_books_examcentral?ie=UTF8&node=4149751031\"},{\"text\":\"Textbooks\",\"url\":\"/Text-Books/b/ref=nav_shopall_sbc_books_textbooks?ie=UTF8&node=4149418031\"},{\"text\":\"Indian Language Books\",\"url\":\"/Indian-Language-Books/b/ref=nav_shopall_sbc_books_indian?ie=UTF8&node=4932325031\"},{\"text\":\"Used Books\",\"url\":\"/b/ref=nav_shopall_sbc_books_used?ie=UTF8&node=10892650031\"},{\"text\":\"Kindle eBooks\",\"url\":\"/ebooks-kindle/b/ref=nav_shopall_sbc_books_ebooks?ie=UTF8&node=1634753031\"}]}]}}},\"PhonesAccessoriesPanel\":{\"promoID\":\"nav-sa-phones-accessories\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Mobiles, Computers\",\"dividerBefore\":\"1\",\"items\":[{\"text\":\"Mobiles, Tablets & More\",\"items\":[{\"text\":\"All Mobile Phones\",\"url\":\"/mobile-phones/b/ref=nav_shopall_sbc_mobcomp_all_mobiles?ie=UTF8&node=1389401031\"},{\"text\":\"All Mobile Accessories\",\"url\":\"/mobile-phone-accessories/b/ref=nav_shopall_sbc_mobcomp_mobile_acc?ie=UTF8&node=1389402031\"},{\"text\":\"Cases & Covers\",\"url\":\"/Cases-Covers/b/ref=nav_shopall_sbc_mobcomp_mobile_covers?ie=UTF8&node=1389409031\"},{\"text\":\"Screen Protectors\",\"url\":\"/Screen-Protectors/b/ref=nav_shopall_sbc_mobcomp_scrn_protector?ie=UTF8&node=1389425031\"},{\"text\":\"Power Banks\",\"url\":\"/Power-Banks/b/ref=nav_shopall_sbc_mobcomp_powerbank?ie=UTF8&node=6612025031\"},{\"text\":\"All Certified Refurbished\",\"url\":\"/certified-refurbished-electronics/b/ref=nav_shopall_sbc_mobcomp_certfied_refurbished?ie=UTF8&node=12497409031\"},{\"text\":\"Tablets\",\"url\":\"/Tablets/b/ref=nav_shopall_sbc_mobcomp_tablets?ie=UTF8&node=1375458031\"},{\"text\":\"Wearable Devices\",\"url\":\"/b/ref=nav_shopall_sbc_mobcomp_wearable?ie=UTF8&node=11599648031\"},{\"text\":\"Smart Home\",\"url\":\"/b/ref=nav_shopall_sbc_pc_smarthome?ie=UTF8&node=13773797031\"},{\"text\":\"Office Supplies & Stationery\",\"url\":\"/Office-Stationery-Supplies/b/ref=nav_shopall_sbc_mobcomp_office?ie=UTF8&node=2454172031\"},{\"text\":\" Software \",\"url\":\"/Software/b/ref=nav_shopall_sbc_mobcomp_software?ie=UTF8&node=976451031\"}]},{\"text\":\"Computers & Accessories\",\"columnBreak\":\"1\",\"items\":[{\"text\":\" All Computers & Accessories \",\"url\":\"/computers-and-accessories/b/ref=nav_shopall_sbc_mobcomp_all_comp?ie=UTF8&node=976392031\"},{\"text\":\"Laptops\",\"url\":\"/Laptops/b/ref=nav_shopall_sbc_mobcomp_laptops?ie=UTF8&node=1375424031\"},{\"subtext\":\"Pen drives, Memory cards & more\",\"text\":\"Drives & Storage\",\"url\":\"/External-Devices-Data-Storage/b/ref=nav_shopall_sbc_mobcomp_pendrives?ie=UTF8&node=1375393031\"},{\"text\":\"Printers & Ink\",\"url\":\"/Printers/b/ref=nav_shopall_sbc_mobcomp_printers?ie=UTF8&node=1375443031\"},{\"text\":\"Networking Devices\",\"url\":\"/networking-devices/b/ref=nav_shopall_pc_sbc_networking?ie=UTF8&node=1375427031\"},{\"text\":\" Computer Accessories \",\"url\":\"/Computer-Accessories/b/ref=nav_shopall_sbc_mobcomp_comp_acc?ie=UTF8&node=1375248031\"},{\"text\":\"Game Zone\",\"url\":\"/b/ref=nav_shopall_sbc_pc_gamezone?ie=UTF8&node=14142561031\"},{\"text\":\"Monitors\",\"url\":\"/Monitors/b/ref=nav_shopall_sbc_mobcomp_monitors?ie=UTF8&node=1375425031\"},{\"text\":\"Desktops\",\"url\":\"/desktops/b/ref=nav_shopall_sbc_mobcomp_desktops?ie=UTF8&node=1375392031\"},{\"text\":\"Components\",\"url\":\"/Components/b/ref=nav_shopall_sbc_mobcomp_component?ie=UTF8&node=1375344031\"},{\"text\":\"Electronics Only on Amazon\",\"url\":\"/b/ref=nav_shopall_sbc_mobcomp_onlyonamazon?ie=UTF8&node=6734059031\",\"dividerBefore\":\"1\"},{\"subtext\":\"Discover more products\",\"text\":\" All Electronics \",\"url\":\"/electronics/b/ref=nav_shopall_sbc_mobcomp_elec_all?ie=UTF8&node=976419031\"}]}]}}},\"TvApplElecPanel\":{\"promoID\":\"nav-sa-tv-appl-elec\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"TV, Appliances, Electronics\",\"items\":[{\"text\":\"TV, Audio & Cameras\",\"items\":[{\"text\":\"Televisions\",\"url\":\"/TVs/b/ref=nav_shopall_sbc_tvelec_television?ie=UTF8&node=1389396031\"},{\"text\":\"Home Entertainment Systems\",\"url\":\"/Home-Entertainment-Systems/b/ref=nav_shopall_sbc_tvelec_home_ent?ie=UTF8&node=1389375031\"},{\"text\":\"Headphones\",\"url\":\"/headphones/b/ref=nav_shopall_sbc_tvelec_headphones?ie=UTF8&node=1388921031\"},{\"text\":\"Speakers\",\"url\":\"/Speakers/b/ref=nav_shopall_sbc_tvelec_speakers?ie=UTF8&node=1389365031\"},{\"text\":\"Home Audio & Theater\",\"url\":\"/Home-Theatre-Systems/b/ref=nav_shopall_sbc_tvelec_homeaud_all?ie=UTF8&node=1389387031\"},{\"text\":\"Cameras\",\"url\":\"/camera-photography/b/ref=nav_shopall_sbc_tvelec_cameras?ie=UTF8&node=1388977031\"},{\"text\":\"DSLR Cameras\",\"url\":\"/digital-slr-cameras/b/ref=nav_shopall_sbc_tvelec_dslr?ie=UTF8&node=1389177031\"},{\"text\":\"Security Cameras\",\"url\":\"/Surveillance-Cameras/b/ref=nav_shopall_sbc_tvelec_security?ie=UTF8&node=1389203031\"},{\"text\":\"Camera Accessories\",\"url\":\"/camera-accessories/b/ref=nav_shopall_sbc_tvelec_cam_acc?ie=UTF8&node=1388978031\"},{\"text\":\"Musical Instruments & Professional Audio\",\"url\":\"/Musical-Instruments/b/ref=nav_shopall_sbc_tvelec_musical_inst?ie=UTF8&node=3677697031\"},{\"text\":\"Gaming Consoles\",\"url\":\"/Video-Games-Consoles/b/ref=nav_shopall_sbc_tvelec_gaming_consoles?ie=UTF8&node=4092115031\"},{\"subtext\":\"Discover more products\",\"text\":\" All Electronics \",\"url\":\"/electronics/b/ref=nav_shopall_sbc_tvelec_all_elec?ie=UTF8&node=976419031\"}]},{\"text\":\"Appliances\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Air Conditioners\",\"url\":\"/Air-Conditioners/b/ref=nav_shopall_sbc_tvelec_ac?ie=UTF8&node=3474656031\"},{\"text\":\"Refrigerators\",\"url\":\"/Refrigerators/b/ref=nav_shopall_sbc_tvelec_fridges?ie=UTF8&node=1380365031\"},{\"text\":\"Washing Machines\",\"url\":\"/Washing-Machines/b/ref=nav_shopall_sbc_tvelec_washing_machine?ie=UTF8&node=1380369031\"},{\"subtext\":\"Mixer-grinders, Irons & more\",\"text\":\"Kitchen & Home Appliances\",\"url\":\"/kitchen-home-appliances/b/ref=nav_shopall_sbc_tvelec_kitchen_appliances?ie=UTF8&node=4951860031\"},{\"subtext\":\"Fans, Coolers & more\",\"text\":\"Heating & Cooling Appliances\",\"url\":\"/Heating-Cooling/b/ref=nav_shopall_sbc_tvelec_heating_appl?ie=UTF8&node=2083423031\"},{\"text\":\"All Appliances\",\"url\":\"/b/ref=nav_shopall_sbc_tvelec_all_appliance?ie=UTF8&node=5122348031\"}]}]}}},\"cartContent\":{\"html\":\"<div id='nav-cart-flyout' class='nav-empty nav-flyout-content' data-one='' data-many=''><div class='nav-dynamic-full'><div id='nav-cart-standard' class='nav-cart-content'><a href='/gp/cart/view.html/ref=nav_flyout_viewcart?ie=UTF8&amp;hasWorkingJavascript=1' class='nav-cart-title'></a><div class='nav-cart-subtitle'></div><div class='nav-cart-items'></div></div><div id='nav-cart-pantry' class='nav-cart-content' data-box='' data-boxes='' data-box-filled='' data-boxes-filled=''><a href='/gp/cart/view.html/ref=nav_flyout_viewcart?ie=UTF8&amp;hasWorkingJavascript=1' class='nav-cart-title'></a><div class='nav-cart-subtitle'></div><div class='nav-cart-items'></div></div><div id='nav-cart-fresh' class='nav-cart-content'><a href='/gp/cart/view.html/ref=nav_flyout_viewcart?ie=UTF8&amp;hasWorkingJavascript=1' class='nav-cart-title'><img id='nav-cart-fresh-logo' src='https://images-eu.ssl-images-amazon.com/images/G/31/gno/ec-logo-fresh-color._CB491921535_.png'></a><div class='nav-cart-subtitle'></div><div class='nav-cart-items'></div></div></div><div class='nav-ajax-message'></div><div class='nav-dynamic-empty'><p class='nav_p nav-bold nav-cart-empty'> Your Shopping Cart is empty.</p><p class='nav_p '> Give it purpose&mdash;fill it with books, movies, mobiles, cameras, toys and fashion jewellery.</p></div><div class='nav-ajax-error-msg'><p class='nav_p nav-bold'> There's a problem previewing your cart right now.</p><p class='nav_p '> Check your Internet connection and <a href='/gp/cart/view.html/ref=nav_flyout_viewcart?ie=UTF8&hasWorkingJavascript=1' class='nav_a'>go to your cart</a>, or <a href='javascript:void(0);' class='nav_a nav-try-again'>try again</a>.</p></div><div id='nav-cart-footer'><a href='/gp/cart/view.html/ref=nav_flyout_viewcart?ie=UTF8&amp;hasWorkingJavascript=1' id='nav-cart-menu-button' class='nav-action-button'><span class='nav-action-inner'>View Cart<span id='nav-cart-menu-button-count' ><span id='nav-cart-zero'>(<span class='nav-cart-count'>0</span> items)</span><span id='nav-cart-one' style='display: none;'>(<span class='nav-cart-count'>0</span> item)</span><span id='nav-cart-many' style='display: none;'>(<span class='nav-cart-count'>0</span> items)</span></span></span></a></div></div>\"},\"PrimeMusicPanel\":{\"promoID\":\"nav-sa-prime-music\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Amazon Prime Music\",\"items\":[{\"subtext\":\"Stream millions of songs, ad-free\",\"text\":\"Amazon Prime Music\",\"url\":\"http://www.amazon.in/music/prime?ref=dmm_in_nav_pc_apm_mlp\"},{\"subtext\":\"Enjoy Amazon Prime Music on your desktop\",\"text\":\"Open web player\",\"url\":\"https://music.amazon.in/home?ref=dmm_in_nav_pc_apm_webplayer\"},{\"subtext\":\"Just ask for music using your voice\",\"text\":\"Voice controlled with Alexa\",\"url\":\"/b/ref=nav_shopall_dmm_in_nav_pc_apm_alexa?_encoding=UTF8&node=14591179031#alexa\"},{\"subtext\":\"Download Amazon Prime Music on your mobile\",\"text\":\"Amazon Prime Music Apps\",\"url\":\"/b/ref=nav_shopall_dmm_in_nav_pc_apm_download?_encoding=UTF8&node=14439362031#download\"},{\"subtext\":\"Buy millions of albums and vinyl records\",\"text\":\"CDs and Vinyls\",\"url\":\"/b/ref=nav_shopall_dmm_in_nav_pc_apm_cds?_encoding=UTF8&node=976445031#buycds\"}]}}},\"HomeKitchenPanel\":{\"promoID\":\"nav-sa-home-kitchen\",\"template\":{\"name\":\"itemList\",\"data\":{\"text\":\"Home, Kitchen, Pets\",\"items\":[{\"text\":\"Home & Kitchen \",\"items\":[{\"text\":\"Kitchen & Dining\",\"url\":\"/Kitchen-Dining-Store/b/ref=nav_shopall_sbc_hk_kitchendining?ie=UTF8&node=5925789031\"},{\"text\":\"Kitchen Storage & Containers\",\"url\":\"/Kitchen-Storage-Containers/b/ref=nav_shopall_sbc_hk_kitchenstorage?ie=UTF8&node=1379989031\"},{\"text\":\"Furniture\",\"url\":\"/Furniture/b/ref=nav_shopall_sbc_hk_furniture?ie=UTF8&node=1380441031\"},{\"text\":\"Fine Art\",\"url\":\"/fine-art/b/ref=nav_shopall_sbc_fineart_in?ie=UTF8&node=13740856031\"},{\"text\":\"Home Furnishing\",\"url\":\"/Home-Furnishing/b/ref=nav_shopall_sbc_hk_furnishing?ie=UTF8&node=1380442031\"},{\"text\":\"Bedroom Linen\",\"url\":\"/Bedroom-Linen/b/ref=nav_shopall_sbc_hk_bedroom_linen?ie=UTF8&node=1380447031\"},{\"text\":\"Home Décor\\n\",\"url\":\"/Home-D%C3%A9cor/b/ref=nav_shopall_sbc_hk_decor?ie=UTF8&node=1380374031\"},{\"text\":\"Garden & Outdoors\",\"url\":\"/STRING-Garden-Outdoors/b/ref=nav_shopall_sbc_hk_garden_outdoor?ie=UTF8&node=2454175031\"},{\"text\":\"Home Storage\",\"url\":\"/Home-Storage-Organization/b/ref=nav_shopall_sbc_hk_home_storage?ie=UTF8&node=1380510031\"},{\"text\":\"Indoor Lighting\",\"url\":\"/Indoor-Lighting/b/ref=nav_shopall_sbc_hk_lighting?ie=UTF8&node=1380485031\"},{\"text\":\"Home Improvement\",\"url\":\"/Home-Improvement/b/ref=nav_shopall_sbc_hk_homeimprovement?ie=UTF8&node=4286640031\"},{\"text\":\"Sewing & Craft Supplies\",\"url\":\"/Craft-Materials/b/ref=nav_shopall_sbc_hk_craftsupplies?ie=UTF8&node=10743065031\"},{\"text\":\"All Home & Kitchen\",\"url\":\"/Home-Kitchen/b/ref=nav_shopall_sbc_hk_all?ie=UTF8&node=976442031\"}]},{\"text\":\"&nbsp;\",\"columnBreak\":\"1\",\"items\":[{\"text\":\"Shop by Room\",\"url\":\"/b/ref=nav_shopall_sbc_hk_shop_by_room?ie=UTF8&node=10892568031\"},{\"text\":\"Home & Kitchen Deals\",\"url\":\"/Home-and-Kitchen-Deals/b/ref=nav_shopall_sbc_hk_deals?ie=UTF8&node=4916278031\"}]},{\"text\":\"All Certified Refurbished \",\"url\":\"/b/ref=nav_shopall_sbc_hk_certified_refurbished?ie=UTF8&node=15290771031\"},{\"text\":\"Pet Supplies\",\"dividerBefore\":\"1\",\"items\":[{\"text\":\"All Pet Supplies\",\"url\":\"/Pet-Supplies/b/ref=nav_shopall_sbc_hk_pets_all?ie=UTF8&node=2454181031\"},{\"text\":\"Dog supplies\",\"url\":\"/Dogs-Supplies/b/ref=nav_shopall_sbc_hk_petdogs?ie=UTF8&node=4771342031\"}]}]}}},\"templates\":{\"asin-promo\":\"<a href='<#=destination #>' class='nav_asin_promo'>  <img src='<#=image #>' class='nav_asin_promo_img'/>  <span class='nav_asin_promo_headline'><#=headline #></span>  <span class='nav_asin_promo_info'>    <span class='nav_asin_promo_title'><#=productTitle #></span>    <span class='nav_asin_promo_title2'><#=productTitle2 #></span>    <span class='nav_asin_promo_price'><#=price #></span>  </span>  <span class='nav_asin_promo_button nav-sprite'><#=button #></span></a>\",\"discoveryPanelList\":\"<# var renderItems = function(items) { #>    <span class='nav-dp-title nav-item'>    Deliveries at a glance    <div class='nav-divider-container'><div class='nav-divider'></div></div></span>    <# jQuery.each(items, function (i, item) { #>        <span class='nav-item'>            <a href='<#=item.order_link#>' class='nav-dp-link'>                <span class='nav-dp-left-column'>                    <img src='<#=item.image#>' class='nav-dp-image'/>                </span>                <span class='nav-dp-right-column'>                    <span class='nav-dp-text <#=item.status#>'>                        <#=item.status_text#>                        <br/>                    </span>                    <# if(item.secondary_status_text) { #>                        <span class='nav-dp-text-secondary <#=item.status#>'>                            <#=item.secondary_status_text#>                        </span>                    <# } #>                </span>            </a>            <div class='nav-divider-container'><div class='nav-divider'></div></div>        </span>  <# }); #>  <a href='/your-orders/ref=nav_dp_ayo' class='nav-dp-link-emphasis'>      View all orders  </a><# }; #><# renderItems(items); #>\",\"itemList\":\"<# var hasColumns = (function () {  var checkColumns = function (_items) {    if (!_items) {      return false;    }    for (var i=0; i<_items.length; i++) {      if (_items[i].columnBreak || (_items[i].items && checkColumns(_items[i].items))) {        return true;      }    }    return false;  };  return checkColumns(items);}()); #><# if(hasColumns) { #>  <# if(items[0].image && items[0].image.src) { #>    <div class='nav-column nav-column-first nav-column-image'>  <# } else if (items[0].greeting) { #>    <div class='nav-column nav-column-first nav-column-greeting'>  <# } else { #>    <div class='nav-column nav-column-first'>  <# } #><# } #><# var renderItems = function(items) { #>  <# jQuery.each(items, function (i, item) { #>    <# if(hasColumns && item.columnBreak) { #>      <# if(item.image && item.image.src) { #>        </div><div class='nav-column nav-column-notfirst nav-column-break nav-column-image'>      <# } else if (item.greeting) { #>        </div><div class='nav-column nav-column-notfirst nav-column-break nav-column-greeting'>      <# } else { #>        </div><div class='nav-column nav-column-notfirst nav-column-break'>      <# } #>    <# } #>    <# if(item.dividerBefore) { #>      <div class='nav-divider'></div>    <# } #>    <# if(item.text || item.content) { #>      <# if(item.url) { #>        <a href='<#=item.url #>' class='nav-link      <# } else {#>        <span class='      <# } #>      <# if(item.panelKey) { #>        nav-hasPanel      <# } #>      <# if(item.items) { #>        nav-title      <# } #>      <# if(item.decorate == 'carat') { #>        nav-carat      <# } #>      <# if(item.decorate == 'nav-action-button') { #>        nav-action-button      <# } #>      nav-item'      <# if(item.extra) { #>        <#=item.extra #>      <# } #>      <# if(item.id) { #>        id='<#=item.id #>'      <# } #>      <# if(item.dataNavRole) { #>        data-nav-role='<#=item.dataNavRole #>'      <# } #>      <# if(item.dataNavRef) { #>        data-nav-ref='<#=item.dataNavRef #>'      <# } #>      <# if(item.panelKey) { #>        data-nav-panelkey='<#=item.panelKey #>'        role='navigation'        aria-label='<#=item.text#>'      <# } #>      <# if(item.subtextKey) { #>        data-nav-subtextkey='<#=item.subtextKey #>'      <# } #>      <# if(item.image && item.image.height > 16) { #>        style='line-height:<#=item.image.height #>px;'      <# } #>      >      <# if(item.decorate == 'carat') { #>        <i class='nav-icon'></i>      <# } #>      <# if(item.image && item.image.src) { #>        <img class='nav-image' src='<#=item.image.src #>' style='height:<#=item.image.height #>px; width:<#=item.image.width #>px;' />      <# } #>      <# if(item.text) { #>        <span class='nav-text<# if(item.classname) { #> <#=item.classname #><# } #>'><#=item.text#><# if(item.badgeText) { #>          <span class='nav-badge'><#=item.badgeText#></span>        <# } #></span>      <# } else if (item.content) { #>        <span class='nav-content'><# jQuery.each(item.content, function (j, cItem) { #><# if(cItem.url && cItem.text) { #><a href='<#=cItem.url #>' class='nav-a'><#=cItem.text #></a><# } else if (cItem.text) { #><#=cItem.text#><# } #><# }); #></span>      <# } #>      <# if(item.subtext) { #>        <span class='nav-subtext'><#=item.subtext #></span>      <# } #>      <# if(item.url) { #>        </a>      <# } else {#>        </span>      <# } #>    <# } #>    <# if(item.image && item.image.src) { #>      <# if(item.url) { #>        <a href='<#=item.url #>'>       <# } #>      <img class='nav-image'      <# if(item.id) { #>        id='<#=item.id #>'      <# } #>      src='<#=item.image.src #>' <# if (item.alt) { #> alt='<#= item.alt #>'<# } #>/>      <# if(item.url) { #>        </a>       <# } #>    <# } #>    <# if(item.items) { #>      <div class='nav-panel'> <# renderItems(item.items); #> </div>    <# } #>  <# }); #><# }; #><# renderItems(items); #><# if(hasColumns) { #>  </div><# } #>\",\"notificationsList\":\"<div class='nav-item nav-title'>  </div><# jQuery.each(items || [], function (i, item) { #>  <div class='nav-item<# if (item.type) { #> nav-noti-list-<#= item.type #><# } #><# if (item.image && item.image.src) { #> nav-noti-list-with-image<# } #>'>    <# if (item.dismissId) { #>      <div class='nav-noti-list-x' data-noti-id='<#= item.dismissId #>'>&times;</div>    <# } #>    <# if (item.image && item.image.src) { #>      <div class='nav-noti-list-image'>        <img class='nav-noti-list-image-tag' src='<#= item.image.src #>' <# if (item.image.alt) { #> alt='<#= item.image.alt #>'<# } #> <# if (item.image.title) { #> title='<#= item.image.title #>'<# } #>/>      </div>    <# } #>    <# if (item.heading) { #>      <div class='nav-noti-list-heading'><#= item.heading #></div>    <# } #>    <# jQuery.each(item.content || [], function (j, itemContent) { #>      <# if (itemContent.url) { #>        <a href='<#= itemContent.url #>' class='nav-noti-list-content'>      <# } else { #>        <div class='nav-noti-list-content'>      <# } #>        <# if (itemContent.text) { #>          <span class='nav-noti-list-text'><#= itemContent.text #></span>        <# } #>        <# if (itemContent.subtext) { #>          <span class='nav-noti-list-subtext'><#= itemContent.subtext #></span>        <# } #>      <# if (itemContent.url) { #>        </a>      <# } else { #>        </div>      <# } #>    <# }); #>  </div><# }); #>\",\"discoveryPanelSummary\":\"    <span class='nav-dp-title nav-item'>    Deliveries at a glance    <div class='nav-divider-container'><div class='nav-divider'></div></div></span>    <# jQuery.each(items || [], function (i, item) { #>        <span class='nav-item'>            <span class='nav-dp-left-column'>                <img src='<#=item.image.url#>' class='nav-dp-image' height='<#=item.image.height#>'/>            </span>            <span class='nav-dp-right-column'>                <#=item.status_text#>                <div class='nav-dp-secondary-row'>                    <a href='/your-orders/ref=nav_dp_ryo' class='nav-dp-link-emphasis'>                        Sign in to view orders                    </a>                </div>            </span>        </span>    <# }); #>\",\"htmlList\":\"  <# jQuery.each(items, function (i, item) { #>    <div class='nav-item'>      <#=item #>    </div>  <# }); #>\",\"subnav\":\"<# if (obj && obj.type === 'vertical') { #>  <# jQuery.each(obj.rows, function (i, row) { #>    <# if (row.flyoutElement === 'button') { #>      <div class='nav_sv_fo_v_button'        <# if (row.elementStyle) { #>          style='<#= row.elementStyle #>'        <# } #>      >        <a href='<#=row.url #>' class='nav-action-button nav-sprite'>          <#=row.text #>        </a>      </div>    <# } else if (row.flyoutElement === 'list' && row.list) { #>      <# jQuery.each(row.list, function (j, list) { #>        <div class='nav_sv_fo_v_column <#=(j === 0) ? 'nav_sv_fo_v_first' : '' #>'>          <ul class='<#=list.elementClass #>'>          <# jQuery.each(list.linkList, function (k, link) { #>            <# if (k === 0) { link.elementClass += ' nav_sv_fo_v_first'; } #>            <li class='<#=link.elementClass #>'>              <# if (link.url) { #>                <a href='<#=link.url #>' class='nav_a'><#=link.text #></a>              <# } else { #>                <span class='nav_sv_fo_v_span'><#=link.text #></span>              <# } #>            </li>          <# }); #>          </ul>        </div>      <# }); #>    <# } else if (row.flyoutElement === 'link') { #>      <# if (row.topSpacer) { #>        <div class='nav_sv_fo_v_clear'></div>      <# } #>      <div class='<#=row.elementClass #>'>        <a href='<#=row.url #>' class='nav_sv_fo_v_lmargin nav_a'>          <#=row.text #>        </a>      </div>    <# } #>  <# }); #><# } else if (obj) { #>  <div class='nav_sv_fo_scheduled'>    <#= obj #>  </div><# } #>\",\"wishlist\":\"<# jQuery.each(wishlist, function (i, item) { #>  <li class='nav_pop_li'>    <a href='<#=item.url #>' class='nav_a'>      <#=item.name #>    </a>    <div class='nav_tag'>      <!-- TODO this logic should now be in dynamic-wish-list.mi -->      <# if(typeof item.count !='undefined') { #>        <#=          (item.count == 1 ? '{count} item' : '{count} items')            .replace('{count}', item.count)        #>      <# } #>    </div>  </li><# }); #>\",\"cart\":\"<# jQuery.each(items, function (i, item) { #>  <div class='nav-cart-item'>    <a href='<#=item.url #>' class='nav-cart-item-link'>      <img src='<#=item.img #>' class='nav-cart-item-image' />      <span class='nav-cart-item-title'><#=item.name #></span>      <# if (item.weight) { #>        <span class='nav-cart-item-weight' style='display:none;'>          <#= ''.replace('{value}', item.weight.value).replace('{unit}', item.weight.unit) #>        </span>      <# } #>      <# if (item.ourPrice) { #>        <span class='nav-cart-item-buyingPrice'><#=item.ourPrice #></span>      <# } #>      <# if (item.scarcityMessage) { #>        <span class='<#=item.scarcityClass #>'><#=item.scarcityMessage #></span>      <# } #>      <span class='nav-cart-item-quantity'>        <#= 'Quantity: {count}'.replace('{count}', item.qty) #>      </span>    </a>  </div>  <# if (i%2==1) { #>    <div class='nav-cart-item-break'></div>  <# } #><# }); #><div class='nav-cart-item-break'></div>\"}}); });\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"  <script type='text/javascript'>\r\n" + 
				"      window.$Nav && $Nav.declare('config.prefetchUrls', [\"https://images-eu.ssl-images-amazon.com/images/G/01/authportal/common/images/amznbtn-sprite03._CB395592492_.png\",\"https://images-eu.ssl-images-amazon.com/images/G/31/authportal/common/images/amazon_logo_no-org_mid._CB377570192_.png\",\"https://images-eu.ssl-images-amazon.com/images/G/31/authportal/flex/reduced-nav/ap-flex-reduced-nav-2.0._CB309255176_.js\",\"https://images-eu.ssl-images-amazon.com/images/G/31/authportal/flex/reduced-nav/ap-flex-reduced-nav-2.1._CB343893441_.css\",\"https://images-eu.ssl-images-amazon.com/images/G/31/gno/sprites/nav-sprite-global_bluebeacon-V3-1x_optimized._CB516557522_.png\",\"https://images-eu.ssl-images-amazon.com/images/G/31/x-locale/common/buttons/sign-in-secure._CB138348554_.gif\",\"https://images-eu.ssl-images-amazon.com/images/G/31/x-locale/common/login/fwcim._CB481730939_.js\",\"https://images-eu.ssl-images-amazon.com/images/G/31/x-locale/common/transparent-pixel._CB386942716_.gif\"]);\r\n" + 
				"window.$Nav && $Nav.declare('config.prefetch',function() {\r\n" + 
				"    var pUrls = window.$Nav.getNow('config.prefetchUrls');\r\n" + 
				"    (window.AmazonUIPageJS ? AmazonUIPageJS : P).when('A').execute(function (A) { A.preload(pUrls); });\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"  /*  */\r\n" + 
				"  \r\n" + 
				"(window.AmazonUIPageJS ? AmazonUIPageJS : P).when('A').execute(function(A){\r\n" + 
				"  if(A.preload){\r\n" + 
				"    A.preload('https://images-na.ssl-images-amazon.com/images/I/71iULtPe2nL._RC|61L2dvOyb4L.js,41auSr815yL.js,01PngnMp3uL.js,01wBjiz9OvL.js,216el1NpxhL.js,31SYqzmbU3L.js,51+klsvwgqL.js,31kByMCr23L.js_.js?AUIClients/NavDesktopMetaAsset#desktop');\r\n" + 
				"    A.preload('https://images-na.ssl-images-amazon.com/images/I/712ZhgZXQhL._RC|11qlbytjBCL.css,31+YxuPQ6qL.css,21Wyw4UJQLL.css,31TMzWTidCL.css,11S8GiSgx9L.css,31OvHRW+XiL.css,01XHMOHpK1L.css_.css?AUIClients/NavDesktopMetaAsset#desktop.in');\r\n" + 
				"  }\r\n" + 
				"});\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    window.$Nav && $Nav.declare('config.flyoutURL', null);\r\n" + 
				"    window.$Nav && $Nav.declare('btf.lite');\r\n" + 
				"    window.$Nav && $Nav.declare('btf.full');\r\n" + 
				"    window.$Nav && $Nav.declare('btf.exists');\r\n" + 
				"    (window.AmazonUIPageJS ? AmazonUIPageJS : P).register('navCF');\r\n" + 
				"  </script>\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<form style=\"display: none;\">\r\n" + 
				"  <input type=\"hidden\" id=\"rwol-display-called\" value=\"0\">\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"    <script type=\"a-state\" data-a-state=\"{&quot;key&quot;:&quot;rw-dynamic-modal-bootstrap&quot;}\">{\"origSessionId\":\"259-2484040-1898032\",\"subPageType\":null,\"pageType\":\"CustomerReviews\",\"ASIN\":\"B077PW9V3J\",\"path\":\"/hz/reviews-render/srp/-/R10SZ3VAMCLDPE\",\"isAUI\":\"1\"}</script>\r\n" + 
				"      \r\n" + 
				"\r\n" + 
				"      <script>\r\n" + 
				"(window.AmazonUIPageJS ? AmazonUIPageJS : P).when('navCF').execute(function(){\r\n" + 
				"  (window.AmazonUIPageJS ? AmazonUIPageJS : P).load.js('https://images-eu.ssl-images-amazon.com/images/I/11ceECUxsqL.js?AUIClients/RetailWebsiteOverlayAUIAssets');\r\n" + 
				"});\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<!-- btf tilu -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</c:if>\r\n" + 
				"<!-- footer pilu -->\r\n" + 
				"        \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div id=\"rhf\" class=\"copilot-secure-display\" style=\"clear:both\" role=\"complementary\" aria-label=\"Your recently viewed items and featured recommendations\">\r\n" + 
				"\r\n" + 
				"    <div class=\"rhf-frame\" style=\"display:none\">\r\n" + 
				"        <br />\r\n" + 
				"        <div id=\"rhf-container\">\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <div class='rhf-loading-outer'>\r\n" + 
				"        <table class='rhf-loading-middle'>\r\n" + 
				"            <tr>\r\n" + 
				"                <td class='rhf-loading-inner'>\r\n" + 
				"                    <img src=\"https://images-eu.ssl-images-amazon.com/images/G/31/personalization/ybh/loading-4x-gray._CB317974815_.gif\" />\r\n" + 
				"                </td>\r\n" + 
				"            </tr>\r\n" + 
				"        </table>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div id=\"rhf-context\">\r\n" + 
				"    <script type='application/json'>\r\n" + 
				"        {\"rhfHandlerParams\":{\"rhfAsins\":\"\",\"noP13NCache\":\"\",\"weblabTriggers\":\"\",\"auiDebug\":\"\",\"keywords\":\"\",\"rviAsins\":\"\",\"url\":\"\",\"parentSession\":\"259-2484040-1898032\",\"rhfState\":\"\",\"contextMetadataOverride\":\"\",\"currentSubPageType\":null,\"field-keywords\":\"\",\"relatedRequestId\":\"53RX2GATRXV3PYFHQG9N\",\"recsAsins\":\"\",\"excludeASIN\":\"QjA3N1BXOVYzSg==\",\"auditEnabled\":\"\",\"customerId\":\"AXIICQMQ0IE6Y\",\"testRecsFailure\":\"\",\"previewCampaigns\":\"\",\"forceWidgets\":\"\",\"currentPageType\":\"CustomerReviews\",\"stringDebug\":\"\"},\"subPageType\":null,\"requestId\":\"53RX2GATRXV3PYFHQG9N\",\"sessionId\":\"259-2484040-1898032\",\"customerId\":\"AXIICQMQ0IE6Y\",\"pageType\":\"CustomerReviews\",\"ybhHandlerParams\":{\"relatedRequestId\":\"53RX2GATRXV3PYFHQG9N\",\"currentPageType\":\"CustomerReviews\",\"parentSession\":\"259-2484040-1898032\"}}\r\n" + 
				"    </script>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"</div><noscript>\r\n" + 
				"\r\n" + 
				"<div class=\"rhf-border\">\r\n" + 
				"\r\n" + 
				"        <div class=\"rhf-header\">\r\n" + 
				"        Your recently viewed items and featured recommendations\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"<div class=\"rhf-footer\">\r\n" + 
				"    <div class=\"rvi-container\">\r\n" + 
				"\r\n" + 
				"<div class=\"ybh-edit\">\r\n" + 
				"    <div class=\"ybh-edit-arrow\"> &#8250; </div>\r\n" + 
				"    <div class=\"ybh-edit-link\"><a href=\"/gp/yourstore/pym/ref=pd_pyml_rhf/259-2484040-1898032\">View or edit your browsing history</a></div>\r\n" + 
				"</div>\r\n" + 
				"        <span class=\"no-rvi-message\">After viewing product detail pages, look here to find an easy way to navigate back to pages you are interested in.</span>\r\n" + 
				"    </div>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
				"</noscript><div id=\"rhf-error\" style=\"display:none;\">\r\n" + 
				"\r\n" + 
				"<div class=\"rhf-border\">\r\n" + 
				"\r\n" + 
				"        <div class=\"rhf-header\">\r\n" + 
				"        Your recently viewed items and featured recommendations\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"<div class=\"rhf-footer\">\r\n" + 
				"    <div class=\"rvi-container\">\r\n" + 
				"\r\n" + 
				"<div class=\"ybh-edit\">\r\n" + 
				"    <div class=\"ybh-edit-arrow\"> &#8250; </div>\r\n" + 
				"    <div class=\"ybh-edit-link\"><a href=\"/gp/yourstore/pym/ref=pd_pyml_rhf/259-2484040-1898032\">View or edit your browsing history</a></div>\r\n" + 
				"</div>\r\n" + 
				"        <span class=\"no-rvi-message\">After viewing product detail pages, look here to find an easy way to navigate back to pages you are interested in.</span>\r\n" + 
				"    </div>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
				"</div>\r\n" + 
				"        <br />\r\n" + 
				"    </div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div class='navLeftFooter nav-sprite-v1' id='navFooter'><a href=\"#nav-top\" id=\"navBackToTop\"><div class=\"navFooterBackToTop\"><span class=\"navFooterBackToTopText\">Back to top</span></div></a>\r\n" + 
				"\r\n" + 
				"<div class=\"navFooterVerticalColumn navAccessibility\" role=\"presentation\"><div class=\"navFooterVerticalRow navAccessibility\" style=\"display: table-row;\"><div class=\"navFooterLinkCol navAccessibility\"><div class=\"navFooterColHead\">Get to Know Us</div><ul><li class='nav_first'><a href='https://www.aboutamazon.in/?utm_source=gateway&amp;utm_medium=footer' class='nav_a'>About Us</a></li><li><a href='http://amazon.jobs' class='nav_a'>Careers</a></li><li><a href='/b/ref=footer_press?ie=UTF8&amp;node=1592137031' class='nav_a'>Press Releases</a></li><li><a href='/b/ref=footer_cares?ie=UTF8&amp;node=8872558031' class='nav_a'>Amazon Cares</a></li><li class='nav_last'><a href='/Online-Charity/b/ref=footer_smile?ie=UTF8&amp;node=4594605031' class='nav_a'>Gift a Smile</a></li></ul></div><div class=\"navFooterColSpacerInner navAccessibility\"></div><div class=\"navFooterLinkCol navAccessibility\"><div class=\"navFooterColHead\">Connect with Us</div><ul><li class='nav_first'><a href='http://www.amazon.in/gp/redirect.html/ref=footer_fb?location=http://www.facebook.com/AmazonIN&amp;token=2075D5EAC7BB214089728E2183FD391706D41E94&amp;6' class='nav_a'>Facebook</a></li><li><a href='http://www.amazon.in/gp/redirect.html/ref=footer_twitter?location=http://twitter.com/AmazonIN&amp;token=A309DFBFCB1E37A808FF531934855DC817F130B6&amp;6' class='nav_a'>Twitter</a></li><li class='nav_last'><a href='http://www.amazon.in/gp/redirect.html?location=https://www.instagram.com/amazondotin&amp;token=264882C912E9D005CB1D9B61F12E125D5DF9BFC7&amp;source=standards' class='nav_a'>Instagram</a></li></ul></div><div class=\"navFooterColSpacerInner navAccessibility\"></div><div class=\"navFooterLinkCol navAccessibility\"><div class=\"navFooterColHead\">Make Money with Us</div><ul><li class='nav_first'><a href='https://www.amazon.in/selling/ref=nav_footer_sell' class='nav_a'>Sell on Amazon</a></li><li><a href='/gp/redirect.html/ref=footer_assoc?_encoding=UTF8&amp;location=https%3A%2F%2Faffiliate-program.amazon.in%2F%3Futm_campaign%3Dassocshowcase%26utm_medium%3Dfooter%26utm_source%3DGW&amp;source=standards&amp;token=02DFC2EB401D4DB94AD857F5A4215D98B38C148F' class='nav_a'>Become an Affiliate</a></li><li><a href='http://services.amazon.in/services/fulfilment-by-amazon/benefits.html/ref=az_footer_fba?ld=AWRGINFBAfooter' class='nav_a'>Fulfilment by Amazon</a></li><li><a href='https://advertising.amazon.in/?ref=Amz.in' class='nav_a'>Advertise Your Products</a></li><li class='nav_last'><a href='https://www.amazonpay.in/merchant' class='nav_a'>Amazon Pay on Merchants</a></li></ul></div><div class=\"navFooterColSpacerInner navAccessibility\"></div><div class=\"navFooterLinkCol navAccessibility\"><div class=\"navFooterColHead\">Let Us Help You</div><ul><li class='nav_first'><a href='/gp/css/homepage.html/ref=footer_ya' class='nav_a'>Your Account</a></li><li><a href='/gp/css/returns/homepage.html/ref=footer_hy_f_4' class='nav_a'>Returns Centre</a></li><li><a href='/gp/help/customer/display.html/ref=footer_swc?ie=UTF8&amp;nodeId=201083470' class='nav_a'>100% Purchase Protection</a></li><li><a href='/b/ref=footer_mobapp?ie=UTF8&amp;node=6967393031' class='nav_a'>Amazon App Download</a></li><li><a href='/gp/BIT/theamazonapp/ref=footer_assistant_download_copy' class='nav_a'>Amazon Assistant Download</a></li><li class='nav_last'><a href='/gp/help/customer/display.html/ref=footer_gw_m_b_he?ie=UTF8&amp;nodeId=200507590' class='nav_a'>Help</a></li></ul></div></div></div><div class=\"nav-footer-line\"></div>\r\n" + 
				"   \r\n" + 
				"<div class=\"navFooterLine navFooterLogoLine\"><a href=\"/ref=footer_logo\"><div class=\"nav-logo-base nav-sprite\"></div></a></div>\r\n" + 
				"\r\n" + 
				"<div class=\"navFooterLine navFooterLinkLine navFooterPadItemLine \"><ul><li class='nav_first'><a href='http://www.amazon.com.au/ref=footer_au' class='nav_a'>Australia</a></li><li><a href='http://www.amazon.com.br/ref=footer_br' class='nav_a'>Brazil</a></li><li><a href='http://www.amazon.ca/ref=footer_ca' class='nav_a'>Canada</a></li><li><a href='http://www.amazon.cn/ref=footer_cn' class='nav_a'>China</a></li><li><a href='http://www.amazon.fr/ref=footer_fr' class='nav_a'>France</a></li><li><a href='http://www.amazon.de/ref=footer_de' class='nav_a'>Germany</a></li><li><a href='http://www.amazon.it/ref=footer_it' class='nav_a'>Italy</a></li><li><a href='http://www.amazon.co.jp/ref=footer_jp' class='nav_a'>Japan</a></li><li><a href='http://www.amazon.com.mx/ref=footer_mx' class='nav_a'>Mexico</a></li><li><a href='http://www.amazon.nl/ref=footer_nl' class='nav_a'>Netherlands</a></li><li><a href='http://www.amazon.es/ref=footer_es' class='nav_a'>Spain</a></li><li><a href='http://www.amazon.co.uk/ref=footer_uk' class='nav_a'>United Kingdom</a></li><li class='nav_last'><a href='http://www.amazon.com/ref=footer_us' class='nav_a'>United States</a></li></ul></div>\r\n" + 
				"\r\n" + 
				"<div class=\"navFooterLine navFooterLinkLine navFooterDescLine\"><table class=\"navFooterMoreOnAmazon\" cellspacing=\"0\"><tr>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.abebooks.com/' class='nav_a'>AbeBooks<br/> <span class=\"navFooterDescText\">Books, art<br/> & collectibles</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://aws.amazon.com/what-is-cloud-computing/?sc_channel=EL&amp;sc_campaign=IN_amazonfooter' class='nav_a'>Amazon Web Services<br/> <span class=\"navFooterDescText\">Scalable Cloud<br/> Computing Services</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.audible.com/' class='nav_a'>Audible<br/> <span class=\"navFooterDescText\">Download<br/> Audio Books</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.dpreview.in/' class='nav_a'>DPReview<br/> <span class=\"navFooterDescText\">Digital<br/> Photography</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='https://www.imdb.com/' class='nav_a'>IMDb<br/> <span class=\"navFooterDescText\">Movies, TV<br/> & Celebrities</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.junglee.com/' class='nav_a'>Junglee.com<br/> <span class=\"navFooterDescText\">Shop Online<br/> in India</span></a></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr><td>&nbsp;</td></tr>\r\n" + 
				"<tr>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.look.com/' class='nav_a'>Look.com<br/> <span class=\"navFooterDescText\">Kids' Clothing<br/> & Shoes</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.shopbop.com/' class='nav_a'>Shopbop<br/> <span class=\"navFooterDescText\">Designer<br/> Fashion Brands</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='https://www.amazonbusiness.in/' class='nav_a'>	\r\n" + 
				"Amazon Business<br/> <span class=\"navFooterDescText\">Everything For<br/> Your Business</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='https://www.souq.com?ref=footer_souq' class='nav_a'>Souq.com<br/> <span class=\"navFooterDescText\">Shop Online in the<br/> Middle East</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.amazon.in/now?ref=footer_amznow' class='nav_a'>Prime Now<br/> <span class=\"navFooterDescText\"> 2-Hour Delivery<br/> on Everyday Items</span></a></td>\r\n" + 
				"<td class=\"navFooterDescSpacer\" style=\"width: 4%\"></td>\r\n" + 
				"<td class=\"navFooterDescItem\"><a href='http://www.amazon.in/music/prime?ref=footer_apm' class='nav_a'>Amazon Prime Music<br/> <span class=\"navFooterDescText\">Stream millions of songs,<br/> ad-free</span></a></td>\r\n" + 
				"</tr>\r\n" + 
				"</table></div>\r\n" + 
				"   \r\n" + 
				"<div class=\"navFooterLine navFooterLinkLine navFooterPadItemLine navFooterCopyright\"><ul><li class='nav_first'><a href='/gp/help/customer/display.html/ref=footer_cou?ie=UTF8&amp;nodeId=200545940' class='nav_a'>Conditions of Use & Sale</a></li><li><a href='/gp/help/customer/display.html/ref=footer_privacy?ie=UTF8&amp;nodeId=200534380' class='nav_a'>Privacy Notice</a></li><li class='nav_last'><a href='/b/ref=footer_iba?ie=UTF8&amp;node=6691071031' class='nav_a'>Interest-Based Ads</a></li></ul><span>© 1996-2018, Amazon.com, Inc. or its affiliates</span><ul></ul></div>\r\n" + 
				"</div><!-- whfh-6RoA1MoR3Kygjc/UjkalRBMZvElMs85aEQoFBJNgnK5hs/BamR75qA== rid-53RX2GATRXV3PYFHQG9N -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div id=\"sis_pixel_r2\" aria-hidden=\"true\" style=\"height:1px; position: absolute; left: -1000000px; top: -1000000px;\"></div><script>(function(a,b){a.attachEvent?a.attachEvent(\"onload\",b):a.addEventListener&&a.addEventListener(\"load\",b,!1)})(window,function(){setTimeout(function(){var el=document.getElementById(\"sis_pixel_r2\");el&&(el.innerHTML='<iframe id=\"DAsis\" src=\"//aax-eu.amazon-adsystem.com/s/iu3?d=amazon.in&slot=navFooter&a1=0101f0fb1accbcf0ada1593e39813c201a48c1a983ac10df0b6980e8c69150c79eb3&a2=0101414cb1507d7ebadaa3390fbd32ed18704220c81c89548ab5098fbc01663fc212&old_oo=0&cb=1539871473515\" width=\"1\" height=\"1\" frameborder=\"0\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\"></iframe>')},300)});</script><!-- footer tilu -->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div id='be' style=\"display:none;visibility:hidden;\"><form name='ue_backdetect' action=\"get\"><input type=\"hidden\" name='ue_back' value='1' /></form>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"window.ue_ibe = (window.ue_ibe || 0) + 1;\r\n" + 
				"if (window.ue_ibe === 1) {\r\n" + 
				"\r\n" + 
				"var ue_mbl=ue_csm.ue.exec(function(e,a){function l(f){b=f||{};a.AMZNPerformance=b;b.transition=b.transition||{};b.timing=b.timing||{};e.ue.exec(m,\"csm-android-check\")()&&b.tags instanceof Array&&(f=-1!=b.tags.indexOf(\"usesAppStartTime\")||b.transition.type?!b.transition.type&&-1<b.tags.indexOf(\"usesAppStartTime\")?\"warm-start\":void 0:\"view-transition\",f&&(b.transition.type=f));\"reload\"===c._nt&&e.ue_orct||\"intrapage-transition\"===c._nt?a.performance&&performance.timing&&performance.timing.navigationStart?\r\n" + 
				"b.timing.transitionStart=a.performance.timing.navigationStart:delete b.timing.transitionStart:\"undefined\"===typeof c._nt&&a.performance&&performance.timing&&performance.timing.navigationStart&&a.history&&\"function\"===typeof a.History&&\"object\"===typeof a.history&&history.length&&1!=history.length&&(b.timing.transitionStart=a.performance.timing.navigationStart);f=b.transition;var d;d=c._nt?c._nt:void 0;f.subType=d;a.ue&&a.ue.tag&&a.ue.tag(\"has-AMZNPerformance\");c.isl&&a.uex&&uex(\"at\",\"csm-timing\");\r\n" + 
				"n()}function p(b){a.ue&&a.ue.count&&a.ue.count(\"csm-cordova-plugin-failed\",1)}function m(){return a.webclient&&\"function\"===typeof a.webclient.getRealClickTime?a.cordova&&a.cordova.platformId&&\"ios\"==a.cordova.platformId?!1:!0:!1}function n(){try{P.register(\"AMZNPerformance\",function(){return b})}catch(a){}}function h(){if(!b)return\"\";ue_mbl.cnt=null;for(var a=b.timing,d=b.transition,a=[\"mts\",k(a.transitionStart),\"mps\",k(a.processStart),\"mtt\",d.type,\"mtst\",d.subType,\"mtlt\",d.launchType],d=\"\",c=0;c<\r\n" + 
				"a.length;c+=2){var e=a[c],g=a[c+1];\"undefined\"!==typeof g&&(d+=\"&\"+e+\"=\"+g)}return d}function k(a){if(\"undefined\"!==typeof a&&\"undefined\"!==typeof g)return a-g}function q(a,c){b&&(g=c,b.timing.transitionStart=a,b.transition.type=\"view-transition\",b.transition.subType=\"ajax-transition\",b.transition.launchType=\"normal\",ue_mbl.cnt=h)}var c=e.ue||{},g=e.ue_t0,b;if(a.P&&a.P.when&&a.P.register)return a.P.when(\"CSMPlugin\").execute(function(a){a.buildAMZNPerformance&&a.buildAMZNPerformance({successCallback:l,\r\n" + 
				"failCallback:p})}),{cnt:h,ajax:q}},\"mobile-timing\")(ue_csm,window);\r\n" + 
				"\r\n" + 
				"(function(d){d._uess=function(){var a=\"\";screen&&screen.width&&screen.height&&(a+=\"&sw=\"+screen.width+\"&sh=\"+screen.height);var b=function(a){var b=document.documentElement[\"client\"+a];return\"CSS1Compat\"===document.compatMode&&b||document.body[\"client\"+a]||b},c=b(\"Width\"),b=b(\"Height\");c&&b&&(a+=\"&vw=\"+c+\"&vh=\"+b);return a}})(ue_csm);\r\n" + 
				"\r\n" + 
				"(function(a){var b=document.ue_backdetect;b&&b.ue_back&&a.ue&&(a.ue.bfini=b.ue_back.value);a.uet&&a.uet(\"be\");a.onLdEnd&&(window.addEventListener?window.addEventListener(\"load\",a.onLdEnd,!1):window.attachEvent&&window.attachEvent(\"onload\",a.onLdEnd));a.ueh&&a.ueh(0,window,\"load\",a.onLd,1);a.ue&&a.ue.tag&&(a.ue_furl&&a.ue_furl.split?(b=a.ue_furl.split(\".\"))&&b[0]&&a.ue.tag(b[0]):a.ue.tag(\"nofls\"))})(ue_csm);\r\n" + 
				"(function(g,h){function d(a,d){var b={};if(!e||!f)try{var c=h.sessionStorage;c?a&&(\"undefined\"!==typeof d?c.setItem(a,d):b.val=c.getItem(a)):f=1}catch(g){e=1}e&&(b.e=1);return b}var b=g.ue||{},a=\"\",f,e,c,a=d(\"csmtid\");f?a=\"NA\":a.e?a=\"ET\":(a=a.val,a||(a=b.oid||\"NI\",d(\"csmtid\",a)),c=d(b.oid),c.e||(c.val=c.val||0,d(b.oid,c.val+1)),b.ssw=d);b.tabid=a})(ue_csm,window);\r\n" + 
				"ue_csm.ue.exec(function(e,f){var a=e.ue||{},b=a._wlo,d;if(a.ssw){d=a.ssw(\"CSM_previousURL\").val;var c=f.location,b=b?b:c&&c.href?c.href.split(\"#\")[0]:void 0;c=(b||\"\")===a.ssw(\"CSM_previousURL\").val;!c&&b&&a.ssw(\"CSM_previousURL\",b);d=c?\"reload\":d?\"intrapage-transition\":\"first-view\"}else d=\"unknown\";a._nt=d},\"NavTypeModule\")(ue_csm,window);\r\n" + 
				"ue_csm.ue.exec(function(c,a){function g(a){a.run(function(e){d.tag(\"csm-feature-\"+a.name+\":\"+e);d.isl&&c.uex(\"at\")})}if(a.addEventListener)for(var d=c.ue||{},f=[{name:\"touch-enabled\",run:function(b){var e=function(){a.removeEventListener(\"touchstart\",c,!0);a.removeEventListener(\"mousemove\",d,!0)},c=function(){b(\"true\");e()},d=function(){b(\"false\");e()};a.addEventListener(\"touchstart\",c,!0);a.addEventListener(\"mousemove\",d,!0)}}],b=0;b<f.length;b++)g(f[b])},\"csm-features\")(ue_csm,window);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"(function(b,c){var a=c.images;a&&a.length&&b.ue.count(\"totalImages\",a.length)})(ue_csm,document);\r\n" + 
				"(function(b){function c(){var d=[];a.log&&a.log.isStub&&a.log.replay(function(a){e(d,a)});a.clog&&a.clog.isStub&&a.clog.replay(function(a){e(d,a)});d.length&&(a._flhs+=1,n(d),p(d))}function g(){a.log&&a.log.isStub&&(a.onflush&&a.onflush.replay&&a.onflush.replay(function(a){a[0]()}),a.onunload&&a.onunload.replay&&a.onunload.replay(function(a){a[0]()}),c())}function e(d,b){var c=b[1],f=b[0],e={};a._lpn[c]=(a._lpn[c]||0)+1;e[c]=f;d.push(e)}function n(b){q&&(a._lpn.csm=(a._lpn.csm||0)+1,b.push({csm:{k:\"chk\",\r\n" + 
				"f:a._flhs,l:a._lpn,s:\"inln\"}}))}function p(a){if(h)a=k(a),b.navigator.sendBeacon(l,a);else{a=k(a);var c=new b[f];c.open(\"POST\",l,!0);c.setRequestHeader&&c.setRequestHeader(\"Content-type\",\"text/plain\");c.send(a)}}function k(a){return JSON.stringify({rid:b.ue_id,sid:b.ue_sid,mid:b.ue_mid,mkt:b.ue_mkt,sn:b.ue_sn,reqs:a})}var f=\"XMLHttpRequest\",q=1===b.ue_ddq,a=b.ue,r=b[f]&&\"withCredentials\"in new b[f],h=b.navigator&&b.navigator.sendBeacon,l=\"//\"+b.ue_furl+\"/1/batch/1/OE/\",m=b.ue_fci_ft||5E3;a&&(r||h)&&\r\n" + 
				"(a._flhs=a._flhs||0,a._lpn=a._lpn||{},a.attach&&(a.attach(\"beforeunload\",g),a.attach(\"pagehide\",g)),m&&b.setTimeout(c,m),a._ffci=c)})(window);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ue_csm.ue._rtn = 1;\r\n" + 
				"(function(e,f){function h(a){a=a.split(\"?\")[0]||a;a=a.replace(\"http://\",\"\").replace(\"https://\",\"\").replace(\"resource://\",\"\").replace(\"res://\",\"\").replace(\"undefined://\",\"\").replace(\"chrome://\",\"\").replace(/\\*/g,\"\").replace(/!/g,\"\").replace(/~/g,\"\");var b=a.split(\"/\");a=a.substr(a.lastIndexOf(\"/\")+1);b.splice(-1);b=b.map(function(a){c[a]||(c[a]=(k++).toString(36));return c[a]});b.push(a);return b.join(\"!\")}function l(){return f.getEntriesByType(\"resource\").filter(function(a){return d._rre(a)<d._ld}).sort(function(a,\r\n" + 
				"b){return a.responseEnd-b.responseEnd}).splice(0,m).map(function(a){var b=[],c;for(c in a)g[c]&&a[c]&&b.push(g[c]+Math.max(a[c]|0,-1).toString(36));b.push(\"i\"+a.initiatorType);(1==d._rtn&&d._afjs>n||2==d._rtn)&&b.push(\"n\"+h(a.name));return b.join(\"_\")}).join(\"*\")}function p(){var a=\"pm\",b;for(b in c)c.hasOwnProperty(b)&&(a+=\"*\"+c[b]+\"_\"+b);return a}function q(){d.log({k:\"rtiming\",value:l()+\"~\"+p()},\"csm\")}if(f&&f.getEntriesByType&&Array.prototype.map&&Array.prototype.filter&&e.ue&&e.ue.log){var g=\r\n" + 
				"{connectStart:\"c\",connectEnd:\"C\",domainLookupStart:\"d\",domainLookupEnd:\"D\",duration:\"z\",encodedBodySize:\"e\",decodedBodySize:\"E\",fetchStart:\"f\",redirectStart:\"r\",redirectEnd:\"R\",requestStart:\"q\",responseStart:\"s\",responseEnd:\"S\",startTime:\"a\",transferSize:\"t\"},d=e.ue,c={},k=1,n=20,m=200;d&&d._rre&&(d._art=function(){d._ld&&window.setTimeout(q,0)})}})(ue_csm||{},window.performance);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"(function(c,d){var b=c.ue,a=d.navigator;b&&b.tag&&a&&(a=a.connection||a.mozConnection||a.webkitConnection)&&a.type&&b.tag(\"netInfo:\"+a.type)})(ue_csm,window);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"(function(c,d){function h(a,b){for(var c=[],d=0;d<a.length;d++){var e=a[d],f=b.encode(e);if(e[k]){var g=b.metaSep,e=e[k],l=b.metaPairSep,h=[],m=void 0;for(m in e)e.hasOwnProperty(m)&&h.push(m+\"=\"+e[m]);e=h.join(l);f+=g+e}c.push(f)}return c.join(b.resourceSep)}function s(a){var b=a[k]=a[k]||{};b[t]||(b[t]=c.ue_mid);b[u]||(b[u]=c.ue_sid);b[f]||(b[f]=c.ue_id);b.csm=1;a=\"//\"+c.ue_furl+\"/1/\"+a[v]+\"/1/OP/\"+a[w]+\"/\"+a[x]+\"/\"+h([a],y);if(n)try{n.call(d[p],a)}catch(g){c.ue.sbf=1,(new Image).src=a}else(new Image).src=\r\n" + 
				"a}function q(){g&&g.isStub&&g.replay(function(a,b,c){a=a[0];b=a[k]=a[k]||{};b[f]=b[f]||c;s(a)});l.impression=s;g=null}if(!(1<c.ueinit)){var k=\"metadata\",x=\"impressionType\",v=\"foresterChannel\",w=\"programGroup\",t=\"marketplaceId\",u=\"session\",f=\"requestId\",p=\"navigator\",l=c.ue||{},n=d[p]&&d[p].sendBeacon,r=function(a,b,c,d){return{encode:d,resourceSep:a,metaSep:b,metaPairSep:c}},y=r(\"\",\"?\",\"&\",function(a){return h(a.impressionData,z)}),z=r(\"/\",\":\",\",\",function(a){return a.featureName+\":\"+h(a.resources,\r\n" + 
				"A)}),A=r(\",\",\"@\",\"|\",function(a){return a.id}),g=l.impression;n?q():(l.attach(\"load\",q),l.attach(\"beforeunload\",q));try{d.P&&d.P.register&&d.P.register(\"impression-client\",function(){})}catch(B){c.ueLogError(B,{logLevel:\"WARN\"})}}})(ue_csm,window);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var ue_pti = \"B077PW9V3J\";\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var ue_adb = 4;\r\n" + 
				"var ue_adb_rtla = 1;\r\n" + 
				"ue_csm.ue.exec(function(w,a){function q(){if(d&&f){var a;a:{try{a=d.getItem(g);break a}catch(c){}a=void 0}if(a)return b=a,!0}return!1}function r(){b=h;k();if(f)try{d.setItem(g,b)}catch(a){}}function s(){b=1===a.ue_adb_chk?l:h;k();if(f)try{d.setItem(g,b)}catch(c){}}function m(){a.ue_adb_rtla&&c&&0<c.ec&&!1===n&&(c.elh=null,ueLogError({m:\"Hit Info\",fromOnError:1},{logLevel:\"INFO\",adb:b}),n=!0)}function k(){e.tag(b);e.isl&&a.uex&&uex(\"at\",b);p&&p.updateCsmHit(\"adb\",b);c&&0<c.ec?m():a.ue_adb_rtla&&c&&\r\n" + 
				"(c.elh=m)}function t(){return b}if(a.ue_adb){a.ue_fadb=a.ue_fadb||10;var e=a.ue,h=\"adblk_yes\",l=\"adblk_no\",b=\"adblk_unk\",d;a:{try{d=a.localStorage;break a}catch(x){}d=void 0}var g=\"csm:adb\",c=a.ue_err,p=e.cookie,f=void 0!==a.localStorage,u=Math.random()>1-1/a.ue_fadb,n=!1,v=q();u||!v?e.uels(\"https://m.media-amazon.com/images/G/01/csm/showads.v2.js\",{onerror:r,onload:s}):k();a.ue_isAdb=t;a.ue_isAdb.unk=\"adblk_unk\";a.ue_isAdb.no=l;a.ue_isAdb.yes=h}},\"adb\")(document,window);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"(function(b,k,e){function l(a){if(a)try{if(a.id)return\"//*[@id='\"+a.id+\"']\";var c,f=1,b;for(b=a.previousSibling;b;b=b.previousSibling)b.nodeName===a.nodeName&&(f+=1);c=f;var d=a.nodeName;1!==c&&(d+=\"[\"+c+\"]\");a.parentNode&&(d=l(a.parentNode)+\"/\"+d);return d}catch(e){return\"DETACHED\"}}function g(a){if(a&&a.getAttribute)return a.getAttribute(m)?a.getAttribute(m):g(a.parentElement)}function q(){var a=k.performance||k.webkitPerformance,c=e.ue_backdetect&&e.ue_backdetect.ue_back&&e.ue_backdetect.ue_back.value,\r\n" + 
				"b=n.bfini;return a&&a.navigation&&2===a.navigation.type||1<b||!b&&1<c}function r(){try{var a=JSON.parse(localStorage[p]||\"[]\"),c=0<=a.indexOf(b.ue_id);a.unshift(b.ue_id);a=a.slice(0,s);localStorage[p]=JSON.stringify(a);return c}catch(d){return!1}}var p=\"csm-bf\",s=20,n=b.ue||{},m=\"data-cel-widget\",h=!1,d=[];n.isBF=b.ue_bfs?r():q();b.ue_utils={getXPath:l,getFirstAscendingWidget:function(a,c){b.ue_cel&&b.ue_fem?!0===h?c(g(a)):d.push({element:a,callback:c}):c()},notifyWidgetsLabeled:function(){if(!1===\r\n" + 
				"h){h=!0;for(var a=g,c=0;c<d.length;c++)if(d[c].hasOwnProperty(\"callback\")&&d[c].hasOwnProperty(\"element\")){var b=d[c].callback,e=d[c].element;\"function\"===typeof b&&\"function\"===typeof a&&b(a(e))}d=null}},extractStringValue:function(a){if(\"string\"===typeof a)return a}}})(ue_csm,window,document);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"(function(a,e){a.ue_cel||(a.ue_cel=function(){function f(a,b){b?b.r=z:b={r:z,c:1};!ue_csm.ue_sclog&&b.clog&&g.clog?g.clog(a,b.ns||d,b):b.glog&&g.glog?g.glog(a,b.ns||d,b):g.log(a,b.ns||d,b)}function h(){var a=b.length;if(0<a){for(var e=[],c=0;c<a;c++){var l=b[c].api;l.ready()?(l.on({ts:g.d,ns:d}),k.push(b[c]),f({k:\"mso\",n:b[c].name,t:g.d()})):e.push(b[c])}b=e}}function c(){if(!c.executed){for(var a=0;a<k.length;a++)k[a].api.off&&k[a].api.off({ts:g.d,ns:d});u();f({k:\"eod\",t0:g.t0,t:g.d()},{c:1,il:1});\r\n" + 
				"c.executed=1;for(a=0;a<k.length;a++)b.push(k[a]);k=[];clearTimeout(v);clearTimeout(q)}}function u(a){f({k:\"hrt\",t:g.d()},{c:1,il:1,n:a});s=Math.min(r,w*s);y()}function y(){clearTimeout(q);q=setTimeout(function(){u(!0)},s)}function t(){c.executed||u()}var w=1.5,r=e.ue_cel_max_hrt||3E4,b=[],k=[],d=a.ue_cel_ns||\"cel\",v,q,g=a.ue,l=a.uet,n=a.uex,z=g.rid,s=e.ue_cel_hrt_int||3E3,m=e.requestAnimationFrame||function(a){a()};if(g.isBF)f({k:\"bft\",t:g.d()});else{\"function\"==typeof l&&l(\"bb\",\"csmCELLSframework\",\r\n" + 
				"{wb:1});setTimeout(h,0);g.onunload(c);if(g.onflush)g.onflush(t);v=setTimeout(c,6E5);y();\"function\"==typeof n&&n(\"ld\",\"csmCELLSframework\",{wb:1});return{registerModule:function(a,c){b.push({name:a,api:c});f({k:\"mrg\",n:a,t:g.d()});h()},reset:function(a){f({k:\"rst\",t0:g.t0,t:g.d()});b=b.concat(k);k=[];for(var e=b.length,d=0;d<e;d++)b[d].api.off(),b[d].api.reset();z=a||g.rid;h();clearTimeout(v);v=setTimeout(c,6E5);c.executed=0},timeout:function(a,b){return e.setTimeout(function(){m(function(){c.executed||\r\n" + 
				"a()})},b)},log:f,off:c}}}())})(ue_csm,window);\r\n" + 
				"(function(a,e,f){a.ue_pdm||!a.ue_cel||ue.isBF||(a.ue_pdm=function(){function h(){if(d){var b={w:d.width,aw:d.availWidth,h:d.height,ah:d.availHeight,cd:d.colorDepth,pd:d.pixelDepth};l&&l.w===b.w&&l.h===b.h&&l.aw===b.aw&&l.ah===b.ah&&l.pd===b.pd&&l.cd===b.cd||(l=b,l.t=q(),l.k=\"sci\",x(l))}var b=f.body||{},c=f.documentElement||{},b={w:Math.max(b.scrollWidth||0,b.offsetWidth||0,c.clientWidth||0,c.scrollWidth||0,c.offsetWidth||0),h:Math.max(b.scrollHeight||0,b.offsetHeight||0,c.clientHeight||0,c.scrollHeight||\r\n" + 
				"0,c.offsetHeight||0)};n&&n.w===b.w&&n.h===b.h||(n=b,n.t=q(),n.k=\"doi\",x(n));v=a.ue_cel.timeout(h,g);s+=1}function c(){r(\"ebl\",\"default\",!1)}function u(){r(\"efo\",\"default\",!0)}function y(){r(\"ebl\",\"app\",!1)}function t(){r(\"efo\",\"app\",!0)}function w(){e.setTimeout(function(){f[B]?r(\"ebl\",\"pageviz\",!1):r(\"efo\",\"pageviz\",!0)},0)}function r(a,b,c){z!==c&&x({k:a,t:q(),s:b},{ff:!0===c?0:1});z=c}function b(){m.attach&&(p&&m.attach(C,w,f),D&&P.when(\"mash\").execute(function(a){a&&a.addEventListener&&(a.addEventListener(\"appPause\",\r\n" + 
				"y),a.addEventListener(\"appResume\",t))}),m.attach(\"blur\",c,e),m.attach(\"focus\",u,e))}function k(){m.detach&&(p&&m.detach(C,w,f),D&&P.when(\"mash\").execute(function(a){a&&a.removeEventListener&&(a.removeEventListener(\"appPause\",y),a.removeEventListener(\"appResume\",t))}),m.detach(\"blur\",c,e),m.detach(\"focus\",u,e))}var d,v,q,g,l,n,z=null,s=0,m=a.ue,x=a.ue_cel.log,E=a.uet,A=a.uex,p=!!m.pageViz,C=p&&m.pageViz.event,B=p&&m.pageViz.propHid,D=e.P&&e.P.when;\"function\"==typeof E&&E(\"bb\",\"csmCELLSpdm\",{wb:1});\r\n" + 
				"return{on:function(a){g=a.timespan||500;q=a.ts;d=e.screen;b();a=e.location;x({k:\"pmd\",o:a.origin,p:a.pathname,t:q()});h();\"function\"==typeof A&&A(\"ld\",\"csmCELLSpdm\",{wb:1})},off:function(a){clearTimeout(v);k();m.count&&m.count(\"cel.PDM.TotalExecutions\",s)},ready:function(){return f.body&&a.ue_cel&&a.ue_cel.log},reset:function(){l=n=null}}}(),a.ue_cel&&a.ue_cel.registerModule(\"page module\",a.ue_pdm))})(ue_csm,window,document);\r\n" + 
				"(function(a,e){a.ue_vpm||!a.ue_cel||ue.isBF||(a.ue_vpm=function(){function f(){var a=t(),b={w:e.innerWidth,h:e.innerHeight,x:e.pageXOffset,y:e.pageYOffset};c&&c.w==b.w&&c.h==b.h&&c.x==b.x&&c.y==b.y||(b.t=a,b.k=\"vpi\",c=b,k(c,{clog:1}));u=0;w=t()-a;r+=1}function h(){u||(u=a.ue_cel.timeout(f,y))}var c,u,y,t,w=0,r=0,b=a.ue,k=a.ue_cel.log,d=a.uet,v=a.uex,q=b.attach,g=b.detach;\"function\"==typeof d&&d(\"bb\",\"csmCELLSvpm\",{wb:1});return{on:function(a){t=a.ts;y=a.timespan||100;f();q&&(q(\"scroll\",h),q(\"resize\",\r\n" + 
				"h));\"function\"==typeof v&&v(\"ld\",\"csmCELLSvpm\",{wb:1})},off:function(a){clearTimeout(u);g&&(g(\"scroll\",h),g(\"resize\",h));b.count&&(b.count(\"cel.VPI.TotalExecutions\",r),b.count(\"cel.VPI.TotalExecutionTime\",w),b.count(\"cel.VPI.AverageExecutionTime\",w/r))},ready:function(){return a.ue_cel&&a.ue_cel.log},reset:function(){c=void 0},getVpi:function(){return c}}}(),a.ue_cel&&a.ue_cel.registerModule(\"viewport module\",a.ue_vpm))})(ue_csm,window);\r\n" + 
				"(function(a,e,f){if(!a.ue_fem&&a.ue_cel&&a.ue_utils){var h=a.ue||{};!h.isBF&&!a.ue_fem&&f.querySelector&&e.getComputedStyle&&[].forEach&&(a.ue_fem=function(){function c(a,b){return a>b?3>a-b:3>b-a}function u(a,b){var d=e.pageXOffset,g=e.pageYOffset,f;a:{try{if(a){var k=a.getBoundingClientRect(),m,h=0===a.offsetWidth&&0===a.offsetHeight;c:{for(var l=a.parentNode,v=k.left||0,p=k.top||0,r=k.width||0,s=k.height||0;l&&l!==document.body;){var n;d:{try{if(l){var q=l.getBoundingClientRect();n={x:q.left||\r\n" + 
				"0,y:q.top||0,w:q.width||0,h:q.height||0}}else n=void 0;break d}catch(u){}n=void 0}var F=window.getComputedStyle(l),t=\"hidden\"===F.overflow,w=t||\"hidden\"===F.overflowX,x=t||\"hidden\"===F.overflowY,y=p+s-1<n.y+1||p+1>n.y+n.h-1;if((v+r-1<n.x+1||v+1>n.x+n.w-1)&&w||y&&x){m=!0;break c}l=l.parentNode}m=!1}f={x:k.left+d||0,y:k.top+g||0,w:k.width||0,h:k.height||0,d:(h||m)|0}}else f=void 0;break a}catch(N){}f=void 0}if(f&&!a.cel_b)a.cel_b=f,A({n:a.getAttribute(z),w:a.cel_b.w,h:a.cel_b.h,d:a.cel_b.d,x:a.cel_b.x,\r\n" + 
				"y:a.cel_b.y,t:b,k:\"ewi\",cl:a.className},{clog:1});else{if(d=f)d=a.cel_b,g=f,d=g.d===d.d&&1===g.d?!1:!(c(d.x,g.x)&&c(d.y,g.y)&&c(d.w,g.w)&&c(d.h,g.h)&&d.d===g.d);d&&(a.cel_b=f,A({n:a.getAttribute(z),w:a.cel_b.w,h:a.cel_b.h,d:a.cel_b.d,x:a.cel_b.x,y:a.cel_b.y,t:b,k:\"ewi\"},{clog:1}))}}function y(b,d){var c;c=b.c?f.getElementsByClassName(b.c):b.id?[f.getElementById(b.id)]:f.querySelectorAll(b.s);b.w=[];for(var g=0;g<c.length;g++){var e=c[g];if(e){if(!e.getAttribute(z)){var k=e.getAttribute(\"cel_widget_id\")||\r\n" + 
				"(b.id_gen||E)(e,g)||e.id;e.setAttribute(z,k)}b.w.push(e);r(O,e,d)}}!1===x&&(m++,m===s.length&&(x=!0,a.ue_utils.notifyWidgetsLabeled()))}function t(a,b){p.contains(a)||A({n:a.getAttribute(z),t:b,k:\"ewd\"},{clog:1})}function w(a){I.length&&ue_cel.timeout(function(){if(l){for(var b=Q(),c=!1;Q()-b<g&&!c;){for(c=R;0<c--&&0<I.length;){var d=I.shift();S[d.type](d.elem,d.time)}c=0===I.length}T++;w(a)}},0)}function r(a,b,c){I.push({type:a,elem:b,time:c})}function b(a,b){for(var c=0;c<s.length;c++)for(var d=\r\n" + 
				"s[c].w||[],e=0;e<d.length;e++)r(a,d[e],b)}function k(){J||(J=a.ue_cel.timeout(function(){J=null;var c=n();b(W,c);for(var d=0;d<s.length;d++)r(X,s[d],c);0===s.length&&!1===x&&(x=!0,a.ue_utils.notifyWidgetsLabeled());w(c)},q))}function d(){J||M||(M=a.ue_cel.timeout(function(){M=null;var a=n();b(O,a);w(a)},q))}function v(){return B&&D&&p&&p.contains&&p.getBoundingClientRect&&n}var q=50,g=4.5,l=!1,n,z=\"data-cel-widget\",s=[],m=0,x=!1,E=function(){},A=a.ue_cel.log,p,C,B,D,G=e.MutationObserver||e.WebKitMutationObserver||\r\n" + 
				"e.MozMutationObserver,N=!!G,H,F,U=\"DOMAttrModified\",K=\"DOMNodeInserted\",L=\"DOMNodeRemoved\",M,J,I=[],T=0,R=null,W=\"removedWidget\",X=\"updateWidgets\",O=\"processWidget\",S,V=e.performance||{},Q=V.now&&function(){return V.now()}||function(){return Date.now()};\"function\"==typeof uet&&uet(\"bb\",\"csmCELLSfem\",{wb:1});return{on:function(b){function c(){if(v()){S={removedWidget:t,updateWidgets:y,processWidget:u};if(N){var a={attributes:!0,subtree:!0};H=new G(d);F=new G(k);H.observe(p,a);F.observe(p,{childList:!0,\r\n" + 
				"subtree:!0});F.observe(C,a)}else B.call(p,U,d),B.call(p,K,k),B.call(p,L,k),B.call(C,K,d),B.call(C,L,d);k()}}p=f.body;C=f.head;B=p.addEventListener;D=p.removeEventListener;n=b.ts;s=a.cel_widgets||[];R=b.bs||5;h.deffered?c():h.attach&&h.attach(\"load\",c);\"function\"==typeof uex&&uex(\"ld\",\"csmCELLSfem\",{wb:1});l=!0},off:function(){v()&&(F&&(F.disconnect(),F=null),H&&(H.disconnect(),H=null),D.call(p,U,d),D.call(p,K,k),D.call(p,L,k),D.call(C,K,d),D.call(C,L,d));h.count&&h.count(\"cel.widgets.batchesProcessed\",\r\n" + 
				"T);l=!1},ready:function(){return a.ue_cel&&a.ue_cel.log},reset:function(){s=a.cel_widgets||[]}}}(),a.ue_cel&&a.ue_fem&&a.ue_cel.registerModule(\"features module\",a.ue_fem))}})(ue_csm,window,document);\r\n" + 
				"(function(a,e,f){!a.ue_mcm&&a.ue_cel&&a.ue_utils&&!a.ue.isBF&&(a.ue_mcm=function(){function h(a,c){var d=a.srcElement||a.target||{},h={k:u,w:(c||{}).ow||(e.body||{}).scrollWidth,h:(c||{}).oh||(e.body||{}).scrollHeight,t:(c||{}).ots||y(),x:a.pageX,y:a.pageY,p:r.getXPath(d),n:d.nodeName};f&&\"function\"===typeof f.now&&a.timeStamp&&(h.dt=(c||{}).odt||f.now()-a.timeStamp,h.dt=parseFloat(h.dt.toFixed(2)));a.button&&(h.b=a.button);d.href&&(h.r=r.extractStringValue(d.href));d.id&&(h.i=d.id);d.className&&\r\n" + 
				"d.className.split&&(h.c=d.className.split(/\\s+/));w(h,{c:1})}function c(){switch(a.ue_mcimp){case 1:return\"click\";case 3:return\"mousedown\"}}var u=\"mcm\",y,t=a.ue,w=a.ue_cel.log,r=a.ue_utils;return{on:function(b){y=b.ts;a.ue_cel_stub&&a.ue_cel_stub.replayModule(u,h);(event=c())?window.addEventListener&&window.addEventListener(event,h,!0):t.attach&&t.attach(\"click\",h,e)},off:function(a){(event=c())?window.removeEventListener&&window.removeEventListener(event,h,!0):t.detach&&t.detach(\"click\",h,e)},ready:function(){return a.ue_cel&&\r\n" + 
				"a.ue_cel.log},reset:function(){}}}(),a.ue_cel&&a.ue_cel.registerModule(\"mouse click module\",a.ue_mcm))})(ue_csm,document,window.performance);\r\n" + 
				"(function(a,e){a.ue_mmm||!a.ue_cel||a.ue.isBF||(a.ue_mmm=function(f){function h(a,b){var c={x:a.pageX||a.x||0,y:a.pageY||a.y||0,t:r()};!b&&A&&(c.t-A.t<y||c.x==A.x&&c.y==A.y)||(A=c,m.push(c))}function c(){if(m.length){z=G.now();for(var a=0;a<m.length;a++){var b=m[a],c=a;p=m[E];C=b;var e=void 0;if(!(e=2>c)){e=void 0;a:if(m[c].t-m[c-1].t>u)e=0;else{for(e=E+1;e<c;e++){var f=p,h=C,k=m[e];B=(h.x-f.x)*(f.y-k.y)-(f.x-k.x)*(h.y-f.y);if(B*B/((h.x-f.x)*(h.x-f.x)+(h.y-f.y)*(h.y-f.y))>t){e=0;break a}}e=1}e=!e}(D=\r\n" + 
				"e)?E=c-1:x.pop();x.push(b)}s=G.now()-z;q=Math.min(q,s);g=Math.max(g,s);l=(l*n+s)/(n+1);n+=1;d({k:w,e:x,min:Math.floor(1E3*q),max:Math.floor(1E3*g),avg:Math.floor(1E3*l)},{c:1});m=[];x=[];E=0}}var u=100,y=20,t=25,w=\"mmm1\",r,b,k=a.ue,d=a.ue_cel.log,v,q=1E3,g=0,l=0,n=0,z,s,m=[],x=[],E=0,A,p,C,B,D,G=f&&f.now&&f||Date.now&&Date||{now:function(){return(new Date).getTime()}};return{on:function(a){r=a.ts;b=a.ns;k.attach&&k.attach(\"mousemove\",h,e);v=setInterval(c,3E3)},off:function(a){b&&(A&&h(A,!0),c());\r\n" + 
				"clearInterval(v);k.detach&&k.detach(\"mousemove\",h,e)},ready:function(){return a.ue_cel&&a.ue_cel.log},reset:function(){m=[];x=[];E=0;A=null}}}(window.performance),a.ue_cel&&a.ue_cel.registerModule(\"mouse move module\",a.ue_mmm))})(ue_csm,document);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ue_csm.ue_unrt = 750;\r\n" + 
				"(function(d,b,t){function u(a,b){var c=a.srcElement||a.target||{},e={k:w,t:b.t,dt:b.dt,x:a.pageX,y:a.pageY,p:f.getXPath(c),n:c.nodeName};a.button&&(e.b=a.button);c.type&&(e.ty=c.type);c.href&&(e.r=f.extractStringValue(c.href));c.id&&(e.i=c.id);c.className&&c.className.split&&(e.c=c.className.split(/\\s+/));g+=1;f.getFirstAscendingWidget(c,function(a){e.wd=a;d.ue.log(e,r)})}function x(a){if(!y(a.srcElement||a.target)){k+=1;n=!0;var v=h=d.ue.d(),c;p&&\"function\"===typeof p.now&&a.timeStamp&&(c=p.now()-\r\n" + 
				"a.timeStamp,c=parseFloat(c.toFixed(2)));s=b.setTimeout(function(){u(a,{t:v,dt:c})},z)}}function A(a){if(a){var b=a.filter(B);a.length!==b.length&&(q=!0,l=d.ue.d(),n&&q&&(l&&h&&d.ue.log({k:C,t:h,m:Math.abs(l-h)},r),m(),q=!1,l=0))}}function B(a){if(!a)return!1;var b=\"characterData\"===a.type?a.target.parentElement:a.target;if(!b||!b.hasAttributes||!b.attributes)return!1;var c={\"class\":[\"gw-clock\",\"gw-clock-aria\",\"s-item-container-height-auto\",\"feed-carousel\"],id:[\"dealClock\",\"deal_expiry_timer\",\"timer\"],\r\n" + 
				"role:[\"timer\"]},e=!1;Object.keys(c).forEach(function(a){var d=b.attributes[a]?b.attributes[a].value:\"\";(c[a]||\"\").forEach(function(a){-1!==d.indexOf(a)&&(e=!0)})});return e}function y(a){if(!a)return!1;var b=(f.extractStringValue(a.nodeName)||\"\").toLowerCase(),c=(f.extractStringValue(a.type)||\"\").toLowerCase(),e=(f.extractStringValue(a.href)||\"\").toLowerCase();a=(f.extractStringValue(a.id)||\"\").toLowerCase();var d=\"checkbox color date datetime-local email file month number password radio range reset search tel text time url week\".split(\" \");\r\n" + 
				"if(-1!==[\"select\",\"textarea\"].indexOf(b)||\"input\"===b&&-1!==d.indexOf(c)||\"a\"===b&&-1!==e.indexOf(\"http\")||-1!==[\"sitbreaderrightpageturner\",\"sitbreaderleftpageturner\",\"sitbreaderpagecontainer\"].indexOf(a))return!0}function m(){n=!1;h=0;b.clearTimeout(s)}function D(){b.ue.onSushiUnload(function(){ue.event({violationType:\"unresponsive-clicks\",violationCount:g,totalScanned:k},\"csm\",\"csm.ArmoredCXGuardrailsViolation.3\")});b.ue.onunload(function(){ue.count(\"armored-cxguardrails.unresponsive-clicks.violations\",\r\n" + 
				"g);ue.count(\"armored-cxguardrails.unresponsive-clicks.violationRate\",g/k*100||0)})}if(b.MutationObserver&&b.addEventListener&&Object.keys&&d&&d.ue_unrt&&d.ue_utils){var z=d.ue_unrt,r=\"cel\",w=\"unr_mcm\",C=\"res_mcm\",p=b.performance,f=d.ue_utils,n=!1,h=0,s=0,q=!1,l=0,g=0,k=0;b.addEventListener&&(b.addEventListener(\"mousedown\",x,!0),b.addEventListener(\"beforeunload\",m,!0),b.addEventListener(\"visibilitychange\",m,!0),b.addEventListener(\"pagehide\",m,!0));b.ue&&b.ue.event&&b.ue.onSushiUnload&&b.ue.onunload&&\r\n" + 
				"D();(new MutationObserver(A)).observe(t,{childList:!0,attributes:!0,characterData:!0,subtree:!0})}})(ue_csm,window,document);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"ue_csm.ue.exec(function(g,f){if(f.ue_err){var e=\"\";f.ue_err.addContextInfo=function(a){if(!a.logLevel||\"FATAL\"===a.logLevel)if(e=g.getElementsByTagName(\"html\")[0].innerHTML){var b=e.indexOf(\"var ue_t0=ue_t0||+new Date();\");if(-1!=b){var b=e.substr(0,b).split(\"\\n\"),d=Math.max(b.length-5-1,0),b=b.slice(d,b.length-1);a.fcsmln=b.length+1;a.cinfo=a.cinfo||{};for(var c=0;c<b.length;c++)a.cinfo[d+c+1+\"\"]=b[c]}b=e.split(\"\\n\");a.cinfo=a.cinfo||{};if(!(a.f||void 0===a.l||a.l in a.cinfo))for(c=+a.l-1,d=Math.max(c-\r\n" + 
				"2,0),c=Math.min(c+2,b.length-1);d<=c;d++)a.cinfo[d+1+\"\"]=b[d]}}}},\"fatals-context\")(document,window);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"/* ◬ */\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<noscript>\r\n" + 
				"    <img height=\"1\" width=\"1\" style='display:none;visibility:hidden;' src='//fls-eu.amazon.in/1/batch/1/OP/A21TJRUUN4KGV:259-2484040-1898032:53RX2GATRXV3PYFHQG9N$uedata=s:%2Fuedata%2Fuedata%3Fnoscript%26id%3D53RX2GATRXV3PYFHQG9N:0' alt=\"\"/>\r\n" + 
				"</noscript>\r\n" + 
				"</div></body><input type=\"hidden\" name=\"\" value=\"https://m.media-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/js/airy.skin._CB513066589_.js\" id=\"cr-airy-js-source-url\"><input type=\"hidden\" name=\"\" value=\"https://m.media-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/css/beacon._CB513066589_.css\" id=\"cr-airy-css-source-url\"><input type=\"hidden\" name=\"\" value=\"https://m.media-amazon.com/images/G/01/vap/video/airy2/prod/2.0.1460.0/flash/AiryBasicRenderer._CB513066589_.swf\" id=\"cr-video-swf-url\"></html>";
		
		String outpurString = SpiderUtility.getStringWithinDelimiters(pageSource, "class=\"a-icon a-icon-star a-star-5 review-rating\">", "</span>");
		//System.out.println(outpurString); 
		
		
	} 
}
