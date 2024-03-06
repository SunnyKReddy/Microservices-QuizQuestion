API Gateway configurations are not working as of 6th March, 2024
Need to fix the issue to route the requests through API Gateway

used Open Feign client to establish HTTP communication between the Microservices.

Ex: Client -------<http://quizservice/quiz/start/1>------> QuizService -> QuestionService -> QuestionService DB
Quiz Service communicates with Question Service to get all the questions related to the given Quiz id and Return the Quiz object to the Cleint.

