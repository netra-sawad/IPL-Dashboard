IPL Dashboard is a full-stack application built using Spring Boot (back-end) and React (front-end). This project displays  IPL team data and statistics from inception up to the 2024 season (latest available data), using data sourced from Kaggle.

## Features 
Displays IPL teams and season-wise performance

Stats updated until 2024

Clean React-based front-end UI

Spring Boot back-end API with Spring Batch for data ingestion

Data loaded from CSV files and stored in an in-memory database

Modular: Run as a single full-stack app or run front-end and back-end separately.

## Tech Stack

 **Backend:

     Spring Boot
     Spring Batch
     HSQLDB (in-memory database)
     Maven

 **Frontend:
    
    React
    Axios (for API calls)
    HTML5, SCSS, JavaScript

## Datasource
  
  https://www.kaggle.com/datasets/patrickb1912/ipl-complete-dataset-20082020?select=matches.csv

## Installation 

   Install the frontend or backend separately or Install backend only as:

   <div class="termy">

Using mvn package

```console
$ ./mvnw install
```
</div>

<div class="termy">

Run the Project
```console
$ ./mvnw spring-boot:run
```
</div>

<div class="termy">

Open peroject as:
```console
http://{SERVER_HOST}:{SERVER_PORT}
```
</div>
   