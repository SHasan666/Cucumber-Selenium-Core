<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>CAT Analytics</title>

  <!-- CSS -->
  <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
  <link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="/assets/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" href="/assets/css/form-elements.css">


  <!-- <link rel="stylesheet" href="assets/css/style.css"> -->

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

  <!-- Favicon and touch icons -->
  <link rel="icon" type="image/png" href="/assets/ico/nextgenLogo.png" />
  <style>
        #container1{
          margin-top: 70px;
        }

        #container2,#container3
        {
          margin-top: 40px;
        }

        #container4
        {
          margin-top: 40px;
          margin-bottom: 70px;
        }

        .navbar-header {
    float: left;
    padding: 15px;
    text-align: center;
    width: 100%;
	}
	.navbar-brand {
    	float:none;

    }

    .navbar-custom {
    color: #FFFFFF;
    background-color: #840722;
	}

    .navbar-default .navbar-brand {
    color: #FFFFFF;
	}
  </style>

</head>

<body>


  <div class="container">
    <nav class="navbar navbar-default navbar-fixed-top navbar-custom">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">CAT Analytics</a>
        </div>

      </div>
    </nav>
    <div class="row">

      <div class="col-sm-0 col-md-0 col-lg-1"></div>

      <div class="col-sm-12 col-md-12 col-lg-10">
        <div id="container1"></div>
      </div>

      <div class="col-sm-0 col-md-0 col-lg-1"></div>

    </div>

    <div class="row">


      <div class="col-sm-0 col-md-0 col-lg-1"></div>

      <div class="col-sm-12 col-md-12 col-lg-10">
        <div id="container2"></div>
      </div>

      <div class="col-sm-0 col-md-0 col-lg-1"></div>



    </div>

    <div class="row">


      <div class="col-sm-0 col-md-0 col-lg-1"></div>

      <div class="col-sm-12 col-md-12 col-lg-10">
        <div id="container3"></div>
      </div>

      <div class="col-sm-0 col-md-0 col-lg-1"></div>



    </div>

    <div class="row">

      <div class="col-sm-0 col-md-0 col-lg-1"></div>

      <div class="col-sm-12 col-md-12 col-lg-10">
        <div id="container4"></div>
      </div>

      <div class="col-sm-0 col-md-0 col-lg-1"></div>

  	<div class="row">

      <div class="col-sm-0 col-md-0 col-lg-1"></div>

      <div class="col-sm-12 col-md-12 col-lg-10">
        <div id="container5"></div>
      </div>

      <div class="col-sm-0 col-md-0 col-lg-1"></div>

    </div>


    </div>

  </div>


  <!-- Javascript -->
  <script src="/assets/js/jquery-1.11.1.min.js"></script>
  <script src="/assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="/assets/js/jquery.backstretch.min.js"></script>

  <script src="http://code.highcharts.com/highcharts.js"></script>
  <script src="http://code.highcharts.com/modules/exporting.js"></script>
  <!-- optional -->

  <script>
    $(document).ready(function() {



      $.ajax({
        //url: "http://api.openweathermap.org/data/2.5/weather?q=pennsylvania&units=imperial&APPID=20f53df10e078c650f748300ae62da53",
        type: "GET",
        url: 'http://localhost:8080/getAllEffort',
        dataType: "json",
        success: function(data) {

          console.log(data.allProjectEffort);

          var keys = Object.keys(data.allProjectEffort);
          var projects = [];
          var efforts = [];
          for(var i=0;i<keys.length;i++){

            var key = keys[i];
            projects.push(key);
            efforts.push(Math.round( data.allProjectEffort[key] * 1e2 ) / 1e2);
            //console.log(key, data.allProjectEffort[key]);

          }
          console.log(projects);
          console.log(efforts);
          var chart = {
                   type: 'bar'
                };
                var title = {
                   text: 'Total Effort Per Project'
                };
                var subtitle = {
                   text: 'Source: Efforts Matrix.xlsx'
                };
                var xAxis = {
                   categories: projects,
                   title: {
                      text: "Projects"
                   }
                };
                var yAxis = {
                   min: 0,
                   title: {
                      text: 'Effort (HR\'s)',
                      align: 'high'
                   },
                   labels: {
                      overflow: 'justify'
                   }
                };
                var tooltip = {
                   valueSuffix: ' HR\'s'
                };
                var plotOptions = {
                   bar: {
                      dataLabels: {
                         enabled: true
                      }
                   }
                };
                var legend = {
                   layout: 'vertical',
                   align: 'right',
                   verticalAlign: 'top',
                   x: -10,
                   y: 100,
                   floating: true,
                   borderWidth: 1,

                   backgroundColor: (
                      (Highcharts.theme && Highcharts.theme.legendBackgroundColor) ||
                         '#FFFFFF'),
                   shadow: true
                };
                var credits = {
                   enabled: false
                };
                var series = [
                   {
                      name: 'Total Efforts',
                      data: efforts
                   }
                ];

                var json = {};
                json.chart = chart;
                json.title = title;
                json.subtitle = subtitle;
                json.tooltip = tooltip;
                json.xAxis = xAxis;
                json.yAxis = yAxis;
                json.series = series;
                json.plotOptions = plotOptions;
                json.legend = legend;
                json.credits = credits;
                $('#container1').highcharts(json);




                console.log("Next",data.allApplicationByEffortPerProject);

                var chart = {
               type: 'bar'
            };
            var title = {
               text: 'Total Effort Per Project By Application'
            };
            var subtitle = {
               text: 'Source: Efforts Matrix.xlsx'
            };
            var xAxis = {
               categories: projects,
               title: {
                  text: "Projects"
               }
            };
            var yAxis = {
               min: 0,
               title: {
                  text: 'Effort (HR\'s)',
                  align: 'high'
               },
               labels: {
                  overflow: 'justify'
               }
            };
            var tooltip = {
               valueSuffix: ' HR\'s'
            };
            var plotOptions = {
               bar: {
                  dataLabels: {
                     enabled: true
                  }
               },
               series: {
                  stacking: 'normal' ,
                  events: {
                    legendItemClick: function(e) {
                          // Upon cmd-click of a legend item, rather than toggling visibility, we want to hide all other items.
                           var hideAllOthers = (e.browserEvent.metaKey || e.browserEvent.ctrlKey);
                          if (hideAllOthers) {
                              var seriesIndex = this.index;
                              var series = this.chart.series;

                              for (var i = 0; i < series.length; i++) {
                                  // rather than calling 'show()' and 'hide()' on the series', we use setVisible and then
                                  // call chart.redraw --- this is significantly faster since it involves fewer chart redraws
                                  if (series[i].index === seriesIndex) {
                                      if (!series[i].visible) series[i].setVisible(true, false);
                                  } else {
                                      if (series[i].visible) series[i].setVisible(false, false);
                                  }
                              }
                              this.chart.redraw();
                              return false;
                          }
                      }
                  }

               }
            };
            var legend = {
              width: 400,

              align: 'center',
              x: 60, // = marginLeft - default spacingLeft
              itemWidth: 100,
              borderWidth: 1,
              shadow: true
            };
            var credits = {
               enabled: false
            };
            var series = data.allApplicationByEffortPerProject;

            var json = {};
            json.chart = chart;
            json.title = title;
            json.subtitle = subtitle;
            json.tooltip = tooltip;
            json.xAxis = xAxis;
            json.yAxis = yAxis;
            json.series = series;
            json.plotOptions = plotOptions;
            json.legend = legend;
            json.credits = credits;
            $('#container2').highcharts(json);



            var chart = {
               type: 'column'
            };
            var title = {
               text: 'Total Effort Per Application'
            };
            var subtitle = {
               text: 'Source: Efforts Matrix.xlsx'
            };
            var xAxis = {
               categories: data.allApplicationByEffort.allApplication,
               crosshair: true
            };
            var yAxis = {
               min: 0,
               title: {
                  text: 'Effort (HR\'s)'
               }
            };
            var tooltip = {
               headerFormat: '<span style = "font-size:10px">{point.key}</span><table>',
               pointFormat: '<tr><td style = "color:{series.color};padding:0">{series.name}: </td>' +
                  '<td style = "padding:0"><b>{point.y:.2f} HR\'s</b></td></tr>',
               footerFormat: '</table>',
               shared: true,
               useHTML: true
            };
            var plotOptions = {
               column: {
                  pointPadding: 0.2,
                  borderWidth: 0
               }
            };
            var legend = {

              borderWidth: 1,
              shadow: true
            };
            var credits = {
               enabled: false
            };
            var series= [
               {
                  name: 'Application',
                  data: data.allApplicationByEffort.totalEfforPerApplication
               }
            ];

            var json = {};
            json.chart = chart;
            json.title = title;
            json.subtitle = subtitle;
            json.tooltip = tooltip;
            json.xAxis = xAxis;
            json.yAxis = yAxis;
            json.series = series;
            json.legend = legend;
            json.plotOptions = plotOptions;
            json.credits = credits;
            $('#container3').highcharts(json);




            var title = {
               text: 'Effort Trend By Application'
            };
            var subtitle = {
               text: 'Source: Efforts Matrix.xlsx'
            };
            var xAxis = {
               categories: data.yearlyEffortTrendByApplication.availableMonth
            };
            var yAxis = {
               title: {
                  text: 'Effort (HR\'s)'
               },
               plotLines: [{
                  value: 0,
                  width: 1,
                  color: '#808080'
               }]
            };
            var tooltip = {
               valueSuffix: ' HR\'s'
            };
            var legend = {
               layout: 'vertical',
               align: 'right',
               verticalAlign: 'middle',
               borderWidth: 0
            };
            credits: {
              enabled: false
            };
            var series =  data.yearlyEffortTrendByApplication.monthlyEffortPerApplication;

            var json = {};
            json.title = title;
            json.subtitle = subtitle;
            json.xAxis = xAxis;
            json.yAxis = yAxis;
            json.tooltip = tooltip;
            json.legend = legend;
            json.series = series;
            json.credits = credits;
            $('#container4').highcharts(json);

            
            
            var chart = {
                    renderTo:'container',
                     type:'column'
                 };
                 var title = {
                    text: 'Weekly Effort Percentage Per Crew Per Application ( '+data.monthTitle+' '+data.year+' )'
                 };
                 var subtitle = {
                    text: 'Source: Efforts Matrix.xlsx'
                 };

                 var xAxis = {
                    categories: [
                 '1st week','2nd week','3rd week','4th week'
             ]
                 };
                 var yAxis = {
                    lineColor:'#999',
                     lineWidth:1,
                     tickColor:'#666',
                     tickWidth:1,
                     tickLength:3,
                     gridLineColor:'#ddd',
                     title:{
                         text:'Effort %',
                         rotation:0,
                         margin:50,
                     }
                 };
                 var tooltip = {
                    useHTML: true,
                   formatter: function () {
                       return '<div style="text-align: center;"> '+'<b>' + this.x + '</b><br/>' +'<b>' + this.point.name  + '</b><br/>'+
                           this.series.name + ': ' + this.y + '%<br/>' +
                           'Total: ' + this.point.stackTotal+'%</div>';
                   }
                 };
                 var plotOptions = {
                    series: {
                 stacking: 'normal',
                 shadow:false,
                 borderWidth:0
                       }
                 };
                 var credits = {
                    enabled: false
                 };
                 var series= data.weeklyEffortPerAppByEmp;

                 var json = {};
                 json.chart = chart;
                 json.title = title;
                 json.subtitle = subtitle;
                 json.tooltip = tooltip;
                 json.xAxis = xAxis;
                 json.yAxis = yAxis;
                 json.series = series;
                 json.plotOptions = plotOptions;
                 json.credits = credits;
                 $('#container5').highcharts(json);



        },
        error: function(error) {
          console.log("Error:");
          console.log(error);
        }
      });








    });
  </script>

  <!--  <script src="assets/js/scripts.js"></script> -->

  <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

</body>

</html>
