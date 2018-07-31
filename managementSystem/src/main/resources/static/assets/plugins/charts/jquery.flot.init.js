/**
* Theme: Montran Admin Template
* Author: Coderthemes
* Module/App: Flot-Chart
*/


!function($) {
    "use strict";

    var FlotChart = function() {
        this.$body = $("body")
        this.$realData = []
    };

    //creates plot graph
    FlotChart.prototype.createPlotGraph = function(selector, data1, data2, labels, colors, borderColor, bgColor) {
      //shows tooltip
      function showTooltip(x, y, contents) {
        $('<div id="tooltip" class="tooltipflot">' + contents + '</div>').css( {
          position: 'absolute',
          top: y + 5,
          left: x + 5
        }).appendTo("body").fadeIn(200);
      }

      $.plot($(selector),
          [ { data: data1,
            label: labels[0],
            color: colors[0]
          },
          { data: data2,
            label: labels[1],
            color: colors[1]
          }
        ],
        {
            series: {
               lines: {
              show: true,
              fill: true,
              lineWidth: 1,
              fillColor: {
                colors: [ { opacity: 0.5 },
                          { opacity: 0.5 }
                        ]
              }
            },
            points: {
              show: true
            },
            shadowSize: 0
            },
            legend: {
            position: 'nw'
          },
          grid: {
            hoverable: true,
            clickable: true,
            borderColor: borderColor,
            borderWidth: 1,
            labelMargin: 10,
            backgroundColor: bgColor
          },
          yaxis: {
            min: 0,
            max: 15,
            color: 'rgba(0,0,0,0.1)'
          },
          xaxis: {
            color: 'rgba(0,0,0,0.1)'
          },
          tooltip: true,
          tooltipOpts: {
              content: '%s: Value of %x is %y',
              shifts: {
                  x: -60,
                  y: 25
              },
              defaultTheme: false
          }
        });
    },
    //end plot graph


    
    

        //initializing various charts and components
        FlotChart.prototype.init = function() {
          //plot graph data
          var uploads = [[0, 9], [1, 8], [2,12], [3, 8], [4, 12], [5, 14], [6, 14]];
          var downloads = [[0, 5], [1, 7], [2,8], [3, 3], [4, 5], [5, 11], [6, 10]];
          var plabels = ["进货", "销售"];
          var pcolors = ['#6e8cd7', '#1a2942'];
          var borderColor = '#efefef';
          var bgColor = '#fff';
          this.createPlotGraph("#website-stats", uploads, downloads, plabels, pcolors, borderColor, bgColor);
        },

    //init flotchart
    $.FlotChart = new FlotChart, $.FlotChart.Constructor = FlotChart
    
}(window.jQuery),

//initializing flotchart
function($) {
    "use strict";
    $.FlotChart.init()
}(window.jQuery);



