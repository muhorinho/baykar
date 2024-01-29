from locust import HttpUser, task, between

class MyUser(HttpUser):
    wait_time = between(1, 5)  # Kullanıcılar arasında bekleme süresi (1 ila 5 saniye arası)

    @task
    def visit_homepage(self):
        self.client.get("https://kariyer.baykartech.com/tr/")

    @task
    def navigate_career_menu(self):
        menus = ["#personal", "#campuses", "#benefits", "#life_in_baykar"]
        for menu in menus:
            self.client.get(f"https://kariyer.baykartech.com/tr/{menu}")

    @task
    def navigate_job_openings(self):
        self.client.get("https://kariyer.baykartech.com/tr/#services")

    @task
    def navigate_internship_menu(self):
        menus = ["/staj/", "/staj/#seasons", "/staj/#calendar"]
        for menu in menus:
            self.client.get(f"https://kariyer.baykartech.com/tr{menu}")

    @task
    def navigate_faq(self):
        self.client.get("https://kariyer.baykartech.com/tr/#contact")

    @task
    def visit_baykar_website(self):
        self.client.get("https://baykartech.com")
    
    
