from fpdf import FPDF;
public class MarriageBioData {
    (FPDF):
    def header(self):
        self.set_fill_color(128, 0, 0)      # maroon header bar
        self.rect(10, 8, 190, 12, "F")
        self.set_y(10)
        self.set_text_color(255, 255, 255)
        self.set_font("Helvetica", "B", 16)
        self.cell(0, 10, "MARRIAGE BIO DATA", align="C")

pdf = MarriageBioData()
pdf.add_page()
pdf.set_auto_page_break(auto=True, margin=15)
pdf.set_font("Helvetica", size=12)

def section(title):
    pdf.ln(8)
    pdf.set_text_color(128, 0, 0)
    pdf.set_font("Helvetica", "B", 13)
    pdf.cell(0, 8, title, ln=True)
    pdf.set_text_color(0, 0, 0)
    pdf.set_font("Helvetica", size=12)

section("Personal Details")
data = [
    ("Name", "Md. Shadab Alam"),
    ("Date of Birth", "06-03-1997"),
    ("Height", "5'5''"),
    ("Complexion", "Fair"),
    ("Caste", "Sunni Muslim (Salmani)"),
    ("Nature", "Soft-spoken, Homely, Religious")
]
for k, v in data:
    pdf.cell(60, 8, f"{k}:", 0, 0)
    pdf.cell(0, 8, v, ln=True)

section("Educational Qualification")
lines = [
    "I.Com",
    "ITI Diploma in Electrical Branch from Don Bosco Institute/College, Muzaffarpur",
    "Currently working at NTPC Patratu, Jharkhand, as a Project Manager"
]
for line in lines:
    pdf.multi_cell(0, 8, f"- {line}")

section("Hobbies")
pdf.multi_cell(0, 8, "Cricket, Travelling")

section("Family Details")
family = [
    ("Father", "Late Abdul Kadir Jilani"),
    ("Mother", "Rashida Khatoon (Housewife)"),
    ("Brothers", "2"),
    ("   • Md. Mahtab Alam", "Head of the Village (Younger Brother)"),
    ("   • Md. Altaf", "Safety Engineer (Younger Brother)"),
    ("Sisters", "5"),
    ("   • 2 Elder Sisters", "Married"),
    ("   • 2 Younger Sisters", "One Married, One Unmarried")
]
for k, v in family:
    pdf.cell(80, 8, f"{k}:", 0, 0)
    pdf.cell(0, 8, v, ln=True)

section("Contact Details")
contact = [
    ("Village", "Paharpur"),
    ("Post", "Balukaram"),
    ("District", "Vaishali – 844113"),
    ("Contact Numbers", "9934974108, 9709166769")
]
for k, v in contact:
    pdf.cell(60, 8, f"{k}:", 0, 0)
    pdf.cell(0, 8, v, ln=True)

pdf.set_draw_color(128, 0, 0)
pdf.set_line_width(1)
pdf.rect(5, 5, 200, 287)  # maroon border

pdf.output("Md_Shadab_Alam_Marriage_BioData.pdf")
print("✅ PDF saved as Md_Shadab_Alam_Marriage_BioData.pdf")
    
}
